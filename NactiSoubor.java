import java.io.*;
import java.util.Scanner;

public class NactiSoubor {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        Reader r = new FileReader(file);
        Scanner sc = new Scanner(r);

        while (sc.hasNext()){
            System.out.println();
        }

        for (int i = 0; i <; i++) {
            int x = r.read();
            char ch = (char) x;
            System.out.print(ch);
        }
    }
}