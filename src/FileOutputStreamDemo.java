import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fout = null;

        try {
            fis = new FileInputStream("D:\\SpringBoot\\demo.jpeg");
            fout = new FileOutputStream("D:\\SpringBoot\\newdemo.jpeg");
            int data;
            while ((data = fis.read()) != -1) {
                fout.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
