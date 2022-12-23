package Notes.views;

import java.util.Scanner;

import Notes.controllers.NoteController;
import Notes.model.Note;

public class ViewNote {

    private NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {

        System.out.println("NONE\n READ\n CREATE\n UPDATE\n LIST\n DELETE\n EXIT\n");
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt(" \n Введите команду: \n");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }

            if (com == Commands.EXIT)
                return;

            try {
                switch (com) {

                    case CREATE:
                        noteController.saveNote(setNote(false));
                        break;

                    case READ:
                        String id = prompt("Идентификатор : ");
                        Note readedNote = noteController.readNote(id);
                        System.out.println(readedNote);
                        System.out.println("-----------------------------------------------");

                        break;

                    case LIST:

                        for (Note iterable_element : noteController.noteList()) {
                            System.out.println(iterable_element);
                            System.out.println("-----------------------------------------------");
                        }
                        break;

                    case UPDATE:

                        Note updatedNote = setNote(true);
                        noteController.updatNote(updatedNote);

                    case DELETE:
                        String id_delNote = prompt("Идентификатор : ");
                        noteController.deleteNote(id_delNote);
                        System.out.printf("Удалено \n");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Note setNote(boolean forUpdate) {
        String noteId = "";
        if (forUpdate) {
            noteId = prompt("Идентификатор: ");
        }
        String name = prompt("Название: ");
        String text = prompt("Текст: ");
        String date = prompt("Дата: ");

        if (forUpdate) {
            return new Note(noteId, name, text, date);
        }
        return new Note(name, text, date);

    }

}
