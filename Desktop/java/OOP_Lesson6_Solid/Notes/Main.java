package Notes;

import Notes.controllers.NoteController;
import Notes.model.FileOperation;
import Notes.model.NoteMapper;
import Notes.model.Repository;
import Notes.views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperation("Notes/Notes_old.txt");
        NoteMapper mapper = new NoteMapper();
        Repository repository = new Repository(fileOperation, mapper);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();

    }
}
