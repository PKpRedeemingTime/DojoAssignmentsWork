package com.patrickkilpatrick.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrickkilpatrick.lookify.models.Song;
import com.patrickkilpatrick.lookify.services.SongService;

@Controller
public class Main {
	@Autowired
	private SongService songService;
	
	@RequestMapping("/")
	public String index() {
		
		return "main/index.jsp";
		
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("songs", songService.getSongs());
		return "main/dashboard.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String showSong(Model model, @PathVariable("id") Long id) {
		Song song = songService.getSong(id).orElse(null);
    	model.addAttribute("id", id);
    	model.addAttribute("song", song);
		return "song/show.jsp";
		
	}
	
	@RequestMapping("/songs/new")
	public String createSong(@ModelAttribute("song") Song song, Model model) {
		return "song/new.jsp";
		
	}
	
	@PostMapping("/songs/new")
	public String createSongs(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
        if (result.hasErrors()) {
    		return "song/new.jsp";
        }else{
        	songService.addSong(song);
            return "redirect:/dashboard";
        }
	}
	
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		model.addAttribute("songs", songService.searchTopTen());
		return "search/topTen.jsp";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam("artist") String artist) {
		return "redirect:/search/".concat(artist);
	}
	
	@RequestMapping("/search/{artist}")
	public String searchResult(@PathVariable("artist") String artist, Model model) {
		model.addAttribute("artist", artist);
		List<Song> songs = songService.searchByArtist(artist);
		if(songs.isEmpty()) {
			return "redirect:/dashboard";
		} else {
			model.addAttribute("songs", songs);
			return "search/result.jsp";
		}
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}

}
