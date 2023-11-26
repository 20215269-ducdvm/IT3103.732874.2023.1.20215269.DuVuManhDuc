package AimsProject.hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;
public class Book extends Media{

    private List<String> authors = new ArrayList<>();
    public Book() {
        super();
    }
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists");
        } else {
            authors.add(authorName);
            System.out.println("Author added");
        }
    }
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed");
        } else {
            System.out.println("Author not found");
        }
    }
    public void printAuthors() {
        System.out.println("Authors:");
        for (String author : authors) {
            System.out.println(author);
        }
    }
}
