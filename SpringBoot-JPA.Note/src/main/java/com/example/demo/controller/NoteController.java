package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourcesNotFoundException;
import com.example.model.Note;
import com.example.repository.NoteRepository;
@RestController
@RequestMapping("/api")
public class NoteController {
	@Autowired
	NoteRepository noteRepository;
	
	
	@GetMapping("/notes")
	public List<Note> getAllNotes(){
		return noteRepository.findAll();
	}
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note note) {
		
		return noteRepository.save(note);
	}
	@PutMapping("/notes/{id}")
	public Note updateNote(@PathVariable(value="id") long noteId,@Valid@RequestBody Note noteDetails) {
		
		
		Note note= noteRepository.findById(noteId)
				.orElseThrow(()->new ResourcesNotFoundException("Note","Id", noteId));
				
				note.setTitle(noteDetails.getTitle());
				note.setContent(noteDetails.getContent());
				
				Note updatedNote=noteRepository.save(note);
				
				return updatedNote;
				
	}
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value="id")long noteId){
		
		Note note= noteRepository.findById(noteId)
				.orElseThrow(()->new ResourcesNotFoundException("Note","Id", noteId));
				noteRepository.delete(note);
				return ResponseEntity.ok().build();
				
		
	}

}
