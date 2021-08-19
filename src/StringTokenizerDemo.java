import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String s = "You,are,creator,of,your,destiny.";

        StringTokenizer st = new StringTokenizer(s, ",",true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
