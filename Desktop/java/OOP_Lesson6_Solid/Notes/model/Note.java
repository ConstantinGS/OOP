package Notes.model;

public class Note {
    private String id = "";
    private String name;
    private String text;
    private String date;

    public Note(String name, String text, String date) {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public Note(String id, String name, String text, String date) {
        this(name, text, date);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String format_text = "";
        int count = 0;

        while (count < text.length()) {
            format_text += text.charAt(count);
            if ((count % 22 == 0) && (count != 0)) {
                format_text += "\n ";
            }
            count++;

        }

        return String.format(" Запись: %s \n Тема: %s \n  %s \n Дата: %s \n", id, name, format_text,
                date);
    }
}
