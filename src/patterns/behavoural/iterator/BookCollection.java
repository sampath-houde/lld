package patterns.behavoural.iterator;

import java.util.List;

public class BookCollection{

    private List<Book> books;

    BookCollection(List<Book> books) {
        this.books = books;
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<Book> {

        private final List<Book> books;

        private int position = 0 ;

        BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public Boolean hasNext() {
            return books.size() > position;
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
