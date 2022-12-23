package Notes.model;

public class NoteMapper {

    public String map(Note note) {
        String text = note.getText() + "";
        String date = note.getDate();
        if (note.getDate().isEmpty()) {
            date = "Без даты";
        }

        return String.format("%s;/%s;/%s;/%s", note.getId(), note.getName(), text, date);
    }

    public Note map(String line) {

        String[] lines = line.split(";/");
        for (String str : lines) {
            System.out.println(str);
        }

        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }
}
