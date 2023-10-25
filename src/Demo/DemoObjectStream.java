package Demo;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("src/Demo/studentData.dat"); // ghi ra file
        ObjectOutputStream os = new ObjectOutputStream(fos);
        Student student = new Student(1,"Fi",25,true);
        os.writeObject(student);
        os.close();
        System.out.println("Ghi thành công");

        System.out.println("Thực hiện đọc file");
        FileInputStream fis = new FileInputStream("src/Demo/studentData.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student1 = (Student) ois.readObject();
        System.out.println(student1);
        ois.close();
        System.out.println("Kết thúc đọc file");
    }
}
