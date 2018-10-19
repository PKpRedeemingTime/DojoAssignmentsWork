package com.patrickkilpatrick.finalLanguages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.patrickkilpatrick.finalLanguages.models.Language;
import com.patrickkilpatrick.finalLanguages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository languageRepo;
	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public List<Language> getLanguages() {
		return languageRepo.findAll();
	}
	
	public void addLanguage(Language lang) {
		languageRepo.save(lang);
	}
	
	public Optional<Language> getLanguage(Long id) {
		return languageRepo.findById(id);
	}
	
	public void updateLanguage(Language lang) {
		languageRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		languageRepo.deleteById(id);
	}
	
}
