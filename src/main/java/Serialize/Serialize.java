package Serialize;

import java.io.*;
import java.util.Objects;

public class Serialize {
    public static void main(String[] args) {
        //一般序列化
//        SerializeObject object = new SerializeObject();
//        object.setField01("newField01");
//        object.setField02("newField02");
//        File file = new File(Objects.requireNonNull(object.getClass().getResource("/Object")).getPath());
//        try {
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
//            out.writeObject(object);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //非序列化类子类序列化
        ObjectExtendsNonSerializableObject object01 = new ObjectExtendsNonSerializableObject();
        ObjectExtendsNonSerializableObjectWithConstructor object02 = new ObjectExtendsNonSerializableObjectWithConstructor();

        object01.setField01("newField01");
        object01.setField02("newField02");

        object02.setField01("newField01");
        object02.setField02("newField02");

        File file = new File(Objects.requireNonNull(object01.getClass().getResource("/Object")).getPath());
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(object01);
            out.writeObject(object02);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            ObjectExtendsNonSerializableObject object03 = (ObjectExtendsNonSerializableObject) in.readObject();
            ObjectExtendsNonSerializableObjectWithConstructor object04 = (ObjectExtendsNonSerializableObjectWithConstructor) in.readObject();
            System.out.println(object03.getField01());
            System.out.println(object03.getField02());
            System.out.println("*********************************************************");
            System.out.println(object04.getField01());
            System.out.println(object04.getField02());

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
