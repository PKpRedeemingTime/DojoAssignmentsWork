package com.patrickkilpatrick.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickkilpatrick.dojosAndNinjas.models.Dojo;
import com.patrickkilpatrick.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	public List<Dojo> getAll() {
		return dojoRepo.findAll();
	}
	
	public void createDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public Optional<Dojo> getDojo(Long id) {
		return dojoRepo.findById(id);
	}

}
