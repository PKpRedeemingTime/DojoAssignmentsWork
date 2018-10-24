package com.patrickkilpatrick.relationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patrickkilpatrick.relationships.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{

}
