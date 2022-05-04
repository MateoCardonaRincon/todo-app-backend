package com.sofkau.webdevelopment.todoapp.service;

import com.sofkau.webdevelopment.todoapp.entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
