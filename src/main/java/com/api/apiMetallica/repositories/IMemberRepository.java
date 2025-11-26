package com.api.apiMetallica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.MemberModel;

@Repository

public interface IMemberRepository extends JpaRepository<MemberModel, Long> {

    

}
