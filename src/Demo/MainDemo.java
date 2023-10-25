package Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Fi",true));
        employees.add(new Employee(2,"Yuh",false));

        File file = new File("src/Demo/employee.dat");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(employees);
        outputStream.close();
        System.out.println("Ghi file thành công!");

        FileInputStream inputStream = new FileInputStream("src/Demo/employee.dat");
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        ois.close();
        System.out.println("Kết thục đọc file");
    }
}
