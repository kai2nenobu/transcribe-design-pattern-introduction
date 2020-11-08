package ch01.ex_1_1;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List books;
    public BookShelf(int maxsize) {
        this.books = new ArrayList(maxsize);
    }
    public Book getBookAt(int index) {
        return (Book)books.get(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
