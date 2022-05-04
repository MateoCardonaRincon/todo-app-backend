package com.sofkau.webdevelopment.todoapp.controller;

import com.sofkau.webdevelopment.todoapp.entity.Note;
import com.sofkau.webdevelopment.todoapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("get/notes")
    public List<Note> getAllNotes() {
        return noteService.getNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note) {
        return noteService.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }

    @DeleteMapping("delete/note/{noteId}")
    public void deleteNote(@PathVariable("noteId") Long noteId) {
        noteService.deleteNote(noteId);
    }
}
