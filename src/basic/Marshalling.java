package basic;

import java.io.*;

public class Marshalling implements Serializable {
    private String name;

    private String age;

    private String gender;

    public Marshalling(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream out) throws Exception {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws Exception {
        in.defaultReadObject();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

//    public static void main(String[] args) {
//        Marshalling marshalling = new Marshalling("John", "25");
//        System.out.println("Before serialization: " + marshalling);
//        try (FileOutputStream fos = new FileOutputStream("marshalling.ser")){
//            ObjectOutputStream out = new ObjectOutputStream(fos);
//            out.writeObject(marshalling);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("After serialization: " + marshalling);
//    }
    public static void main(String[] args) {
        Marshalling person = null;

        try (FileInputStream fileIn = new FileInputStream("marshalling.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Marshalling) in.readObject();
            System.out.println("Deserialized Person: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
