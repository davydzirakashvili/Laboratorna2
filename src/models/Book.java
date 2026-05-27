package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements java.io.Externalizable {

    private static final long serialVersionUID = 1L;

    private String title;
    private ArrayList<Author> authors;
    private int year;

    public Book() {
        authors = new ArrayList<>();
    }

    public Book(
            String title,
            ArrayList<Author> authors,
            int year) {

        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(
            ArrayList<Author> authors) {

        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: "
                + title
                + ", year: "
                + year
                + ", authors: "
                + authors;
    }

    @Override
    public void writeExternal(
            java.io.ObjectOutput out)
            throws java.io.IOException {

        out.writeObject(title);

        out.writeObject(authors);

        out.writeInt(year);
    }

    @Override
    public void readExternal(
            java.io.ObjectInput in)
            throws java.io.IOException,
            ClassNotFoundException {

        title = (String) in.readObject();

        authors =
                (java.util.ArrayList<Author>)
                        in.readObject();

        year = in.readInt();
    }
}