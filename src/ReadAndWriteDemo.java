import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteDemo {

    public static void main(String[] args) throws Exception {
        FileReader fr = null;
        FileWriter fw = null;

        fr = new FileReader("D:\\SpringBoot\\test.txt");
        fw = new FileWriter("D:\\SpringBoot\\newtest.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();


    }

}
