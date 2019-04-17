package com.qa.first_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.qa.first_app.model.*;
import com.qa.first_app.repository.NotesRepository;
@RestController
@RequestMapping("api/v1/")
public class NotesController {
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Notes> list(){
		return NotesStub.list();
		 
	}
	@RequestMapping(value = "notes", method = RequestMethod.POST)
    public Notes create(@RequestBody Notes note){
        return NotesStub.create(note);
    }
	@RequestMapping(value = "notes/{id}", method = RequestMethod.POST)
    public Notes get(@PathVariable Long id){
        return NotesStub.get(id);
    }
	@RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
    public Notes update(@PathVariable Long id, @RequestBody Notes note){
        return NotesStub.update(id, note);
    }
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
    public Notes delete(@PathVariable Long id){
        return NotesStub.delete(id);
    }
	@Autowired
	private NotesRepository notesRepository;


}
