package Notes.controllers;

import java.util.List;

import Notes.model.Note;
import Notes.model.Repository;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        validDateNote(note);
        repository.CreateNote(note);
    }

    public List<Note> deleteNote(String noteId) throws Exception {

        return repository.deleteNote(noteId);

    }

    public Note readNote(String noteId) throws Exception {
        return repository.readNote(noteId);
    }

    public List<Note> noteList() {
        return repository.getAllNotes();
    }

    public Note updatNote(Note note) throws Exception {
        validDateNote(note);
        return repository.updateNote(note);
    }

    private void validDateNote(Note note) throws Exception {

        if (note.getName().isEmpty()) {
            throw new Exception("Отсутствует название");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("Отсутствует текст");
        }

    }

}
