package com.qa.first_app.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.first_app.model.*;

public class NotesStub {
	private static Map<Long,Notes> notes = new HashMap<Long,Notes>();
	private static Long idIndex=3L;
	static {
	Notes note1= new Notes( 1L, "idGolf","A very deep Getman Car");
    Notes note2= new Notes( 2L,"astra","decent");
    Notes note3= new Notes( 3L,"Focus","Like new");
	notes.put(1L, note1);
	notes.put(2L, note2);
	notes.put(3L, note3);
	}
	public static List<Notes>list(){
		return new ArrayList<Notes>(notes.values());
	}
	public static Notes create(Notes note) {
		idIndex+=1;
		note.setId(idIndex);
		notes.put(idIndex,note);
		return note;
	}
	public static Notes get(Long id) {return notes.get(id);}
	public static Notes update(Long id, Notes note ) {
		notes.put(id, note);
		return note;
		
	}
	public static Notes delete(Long id) {
		return notes.remove(id);
		
	}
}
