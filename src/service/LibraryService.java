package service;

import java.io.*;

public class LibraryService {

    public static void serializeLibrary(
            String fileName,
            Object obj) {

        try {

            ObjectOutputStream os =
                    new ObjectOutputStream(
                            new FileOutputStream(fileName)
                    );

            os.writeObject(obj);

            os.close();

            System.out.println(
                    "\nSerialization completed."
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static Object deserializeLibrary(
            String fileName) {

        Object obj = null;

        try {

            ObjectInputStream is =
                    new ObjectInputStream(
                            new FileInputStream(fileName)
                    );

            obj = is.readObject();

            is.close();

            System.out.println(
                    "\nDeserialization completed."
            );

        } catch (Exception e) {

            e.printStackTrace();
        }

        return obj;
    }
}