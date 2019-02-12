import java.io.IOException;
import java.util.ArrayList;

public class testArrayWrap {

        public static void main(String[] args) throws IOException {

            codeDownload d = new codeDownload();
            ArrayList data=d.getData("Mirza");

            System.out.println(data.get(0));
            System.out.println(data.get(1));
            System.out.println(data.get(2));
            System.out.println(data.get(3));
            System.out.println(data.get(4));
            System.out.println(data.get(5));
            System.out.println(data.get(6));
        }

}
