package com.api.apiMetallica.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiMetallica.models.MemberModel;
import com.api.apiMetallica.repositories.IMemberRepository;

@Service
public class MemberService {
    @Autowired
    IMemberRepository memberRepository;

    public ArrayList<MemberModel> getMembers() {
        return (ArrayList<MemberModel>) memberRepository.findAll();
    }

    public MemberModel saveMember(MemberModel member) {
        return memberRepository.save(member);
    }

    public Optional<MemberModel> getMemberById(Long id) {
        return memberRepository.findById(id);

    }

    public MemberModel updateById(MemberModel request, Long id) {

        MemberModel member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Miembro no encontrado con id: " + id));

        member.setNombre(request.getNombre());
        member.setRol(request.getRol());
        member.setFechaNacimiento(request.getFechaNacimiento());
        member.setFechaIngreso(request.getFechaIngreso());
        member.setFechaSalida(request.getFechaSalida());
        member.setBiografia(request.getBiografia());

        // Si quieres actualizar la imagen (nombre de archivo o URL)
        member.setImagenPath(request.getImagenPath()); 

        // Guardar los cambios en la base de datos
        return member;
    }

    public Boolean deleteMember(Long id) {
        try {
            memberRepository.deleteById(id);
            return true;
        } catch (Exception e) {

            return false;
        }
    }
}
