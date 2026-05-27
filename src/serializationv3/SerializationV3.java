package serializationv3;

import java.io.*;

public class SerializationV3 {

    public static void serialize(
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
                    "\n[V3] Externalizable serialization completed."
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static Object deserialize(
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
                    "\n[V3] Externalizable deserialization completed."
            );

        } catch (Exception e) {

            e.printStackTrace();
        }

        return obj;
    }
}