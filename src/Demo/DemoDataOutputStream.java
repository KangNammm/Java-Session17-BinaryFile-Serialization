package Demo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutputStream {
    public static void main(String[] args) throws IOException {
        File studentFile = new File("src/Demo/student.dat");
        studentFile.createNewFile();
        Student student = new Student(1,"Fi",25,true);
        boolean status = true;
        double PI = 3.14;
        String language = "English";
        FileOutputStream fos = new FileOutputStream(studentFile);

        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(language);
        dos.writeDouble(PI);
        dos.writeBoolean(status);
        dos.close();

    }
}
