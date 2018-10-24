package com.patrickkilpatrick.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.patrickkilpatrick.lookify.models.Song;
import com.patrickkilpatrick.lookify.repositories.LookifyRepository;

@Service
public class SongService {
	private LookifyRepository lookifyRepo;
	public SongService(LookifyRepository lookifyRepo) {
		this.lookifyRepo = lookifyRepo;
	}
	
	public List<Song> getSongs() {
		return lookifyRepo.findAll();
	}
	
	public void addSong(Song song) {
		lookifyRepo.save(song);
	}
	
	public Optional<Song> getSong(Long id) {
		return lookifyRepo.findById(id);
	}
	
	public void deleteSong(Long id) {
		lookifyRepo.deleteById(id);
	}
	
	public List<Song> searchByArtist(String artist) {
		return lookifyRepo.findByArtistContaining(artist);
	}
	
	public List<Song> searchTopTen() {
		return lookifyRepo.findTop10ByOrderByRatingDesc();
	}
	
}
