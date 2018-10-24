package com.patrickkilpatrick.dojosAndNinjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickkilpatrick.dojosAndNinjas.models.Ninja;
import com.patrickkilpatrick.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public void createNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}

}
