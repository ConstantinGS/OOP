package Model;

import java.io.File;

public class Reporter {

    private String link;

    public Reporter(String link) {
        this.link = link;
    }

    public void report(String addres) {
        System.out.printf("Файл %s отправлен пользователю %s\n", link, addres);
        // return file;
    }

}
