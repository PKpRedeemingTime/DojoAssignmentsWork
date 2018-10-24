package com.patrickkilpatrick.dojosAndNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patrickkilpatrick.dojosAndNinjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

}
