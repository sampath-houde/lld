package patterns.iterator;

public class Book {


    private String name;
    private String author;
    private String date;

    Book(String name, String author, String date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Author: " + author + " Date: " + date;
    }
}
