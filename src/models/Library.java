package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private ArrayList<Book> books;

    private ArrayList<Reader> readers;

    public Library() {

        books = new ArrayList<>();

        readers = new ArrayList<>();
    }

    public Library(String name) {

        this.name = name;

        books = new ArrayList<>();

        readers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    @Override
    public String toString() {

        return "\nLIBRARY: "
                + name
                + "\nBOOKS: "
                + books
                + "\nREADERS: "
                + readers;
    }
}