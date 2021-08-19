import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args)  {
        FileInputStream finput = null;

        try {
            finput = new FileInputStream(new File("D:\\SpringBoot\\IOStreams\\IO.txt"));
            System.out.println("File Opened.");

            int i;
            while((i=finput.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                finput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("\n File closed.");
        }
    }
}
