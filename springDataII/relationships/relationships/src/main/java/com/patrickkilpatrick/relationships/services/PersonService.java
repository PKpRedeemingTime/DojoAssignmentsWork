package com.patrickkilpatrick.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.patrickkilpatrick.relationships.models.License;
import com.patrickkilpatrick.relationships.models.Person;
import com.patrickkilpatrick.relationships.repositories.LicenseRepository;
import com.patrickkilpatrick.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepo;
	private LicenseRepository licenseRepo;
	public PersonService(PersonRepository personRepo, LicenseRepository licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	
	public List<Person> allPersons() {
		return personRepo.findAll();
	}
	
	public void createPerson(Person person) {
		personRepo.save(person);
	}
	
	public Optional<Person> getPerson(Long id) {
		return personRepo.findById(id);
	}
	
	public void createLicense(License license) {
		Long personId = license.getPerson().getId();
		String licNumber = String.format("%06d", personId);
		license.setNumber(licNumber);
		licenseRepo.save(license);
	}
}
