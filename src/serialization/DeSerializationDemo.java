package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D:\\SpringBoot\\IOStreams\\Emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            Employee emp = (Employee) obj;

            System.out.println("Employee Id :"+emp.id);
            System.out.println("Employee name :"+emp.name);
            System.out.println("Employee Salary :"+emp.salary);
            System.out.println("Employee SSN :"+emp.ssn);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
