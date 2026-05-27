package models;

import java.util.ArrayList;

public class Reader extends Human {

    private transient ArrayList<Book> books;

    public Reader() {
        books = new ArrayList<>();
    }

    public Reader(
            String firstName,
            String lastName) {

        super(firstName, lastName);

        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    private void writeObject(
            java.io.ObjectOutputStream out)
            throws java.io.IOException {

        out.defaultWriteObject();

        out.writeInt(books.size());

        for (Book book : books) {
            out.writeObject(book);
        }
    }

    private void readObject(
            java.io.ObjectInputStream in)
            throws java.io.IOException,
            ClassNotFoundException {

        in.defaultReadObject();

        books = new ArrayList<>();

        int size = in.readInt();

        for (int i = 0; i < size; i++) {

            books.add((Book) in.readObject());
        }
    }

    @Override
    public String toString() {
        return "Reader: "
                + super.toString()
                + ", books: "
                + books;
    }
}