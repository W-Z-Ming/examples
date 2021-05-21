package Serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class Serialize {
    public static void main(String[] args) {
        SerializeObject object = new SerializeObject();
        object.setField01("newField01");
        object.setField02("newField02");
        File file = new File(Objects.requireNonNull(object.getClass().getResource("/Object")).getPath());
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
