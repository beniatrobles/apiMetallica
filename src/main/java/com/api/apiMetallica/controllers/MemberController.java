package com.api.apiMetallica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apiMetallica.models.MemberModel;
import com.api.apiMetallica.services.MemberService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController


@RequestMapping("/members")



public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public ArrayList<MemberModel> getMembers() {
        return memberService.getMembers();
    }

    @PostMapping
    public MemberModel saveMember(@RequestBody MemberModel member) {
        return this.memberService.saveMember(member);
    }

    @GetMapping(path = "/{id}")
    public Optional<MemberModel> getMemberById(@PathVariable("id") Long id) {
        return this.memberService.getMemberById(id);

    }

    @PutMapping(path = "/{id}")
    public MemberModel updateMemberById(@RequestBody MemberModel request, @PathVariable("id") Long id) {
        return this.memberService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.memberService.deleteMember(id);

        if (ok) {
            return "Member with id " + id + "deleted.";
        } else {
            return "Error, cant delete member with id: " + id;
        }
    }

}
