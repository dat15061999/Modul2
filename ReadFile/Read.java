package ReadFile;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student std1 = new Student("Nam",24,8.0);
        serialize(std1,"demo.txt");
        deserialize("demo.txt");
    }
    //doc file => object
    // deserialize to Object from given file
    public static Object deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        fis.close();
        return obj;
    }

    //ghi object vo file
    // serialize the given object and save it to file
    public static void serialize(Object obj, String fileName)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
    }

}
