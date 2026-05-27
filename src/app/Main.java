package app;

import models.*;
import serializationv1.SerializationV1;
import serializationv2.SerializationV2;
import serializationv3.SerializationV3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose version:");
        System.out.println("1 - Serializable");
        System.out.println("2 - Custom Serializable");
        System.out.println("3 - Externalizable");

        int choice = scanner.nextInt();

        Author author1 =
                new Author(
                        "George",
                        "Orwell"
                );

        ArrayList<Author> authors =
                new ArrayList<>();

        authors.add(author1);

        Book book1 =
                new Book(
                        "1984",
                        authors,
                        1949
                );

        Reader reader1 =
                new Reader(
                        "Ivan",
                        "Petrenko"
                );

        reader1.addBook(book1);

        Library library =
                new Library("City Library");

        library.addBook(book1);

        library.addReader(reader1);

        System.out.println(
                "\nORIGINAL LIBRARY:"
        );

        System.out.println(library);

        switch (choice) {

            case 1:

                SerializationV1.serialize(
                        "library_v1.dat",
                        library
                );

                Library restoredV1 =
                        (Library)
                                SerializationV1.deserialize(
                                        "library_v1.dat"
                                );

                System.out.println(
                        "\nRESTORED LIBRARY V1:"
                );

                System.out.println(restoredV1);

                break;

            case 2:

                SerializationV2.serialize(
                        "library_v2.dat",
                        library
                );

                Library restoredV2 =
                        (Library)
                                SerializationV2.deserialize(
                                        "library_v2.dat"
                                );

                System.out.println(
                        "\nRESTORED LIBRARY V2:"
                );

                System.out.println(restoredV2);

                break;

            case 3:

                SerializationV3.serialize(
                        "library_v3.dat",
                        library
                );

                Library restoredV3 =
                        (Library)
                                SerializationV3.deserialize(
                                        "library_v3.dat"
                                );

                System.out.println(
                        "\nRESTORED LIBRARY V3:"
                );

                System.out.println(restoredV3);

                break;

            default:

                System.out.println(
                        "Invalid choice."
                );
        }
    }
}