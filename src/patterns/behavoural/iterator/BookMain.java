package patterns.behavoural.iterator;

import java.util.List;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book("C++", "Sampath", "12/3/2001");
        Book book2 = new Book("Java", "Raghul", "1/3/2002");
        Book book3 = new Book("Python", "Akhil", "12/3/2004");
        BookCollection bookCollection = new BookCollection(List.of(book1, book2, book3));
        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
