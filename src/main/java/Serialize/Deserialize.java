package Serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class Deserialize {
    public static void main(String[] args) {
        File file = new File(Objects.requireNonNull(Deserialize.class.getResource("/Object")).getPath());
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
            SerializeObject object = (SerializeObject) input.readObject();
            System.out.println(object.getField01());
            System.out.println(object.getField02());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
