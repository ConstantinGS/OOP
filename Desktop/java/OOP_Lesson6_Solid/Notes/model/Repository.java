package Notes.model;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private NoteMapper mapper;
    private FileOperation fileOperation;

    public Repository(FileOperation fileOperation, NoteMapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;
    }

    public List<Note> getAllNotes() {

        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();

        for (String line : lines) {
            notes.add(mapper.map(line));
        }

        return notes;
    }

    public String CreateNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNotes(notes);
        return id;
    }

    private void saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    public Note updateNote(Note note) throws Exception {

        List<Note> notes = getAllNotes();
        String noteId = note.getId();

        Note foundNote = findNoteById(notes, noteId);

        foundNote.setName(note.getName());
        foundNote.setText(note.getText());
        foundNote.setDate(note.getDate());
        saveNotes(notes);
        return foundNote;

    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = getAllNotes();
        return findNoteById(notes, noteId);
    }

    private Note findNoteById(List<Note> notes, String noteId) throws Exception {
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }
        throw new Exception("Note not found");
    }

    public List<Note> deleteNote(String noteId) throws Exception {
        List<Note> notes = getAllNotes();
        notes.remove(findNoteById(notes, noteId));
        saveNotes(notes);
        return notes;
    }
}
