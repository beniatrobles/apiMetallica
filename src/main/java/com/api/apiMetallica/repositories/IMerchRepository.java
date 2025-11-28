package com.api.apiMetallica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.apiMetallica.models.MerchModel;

@Repository

public interface IMerchRepository extends JpaRepository<MerchModel,Long> {

}
