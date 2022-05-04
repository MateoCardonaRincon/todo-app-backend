package com.sofkau.webdevelopment.todoapp.repository;

import com.sofkau.webdevelopment.todoapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
