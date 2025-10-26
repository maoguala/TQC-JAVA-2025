package JP05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class J502 {
    public static void main(String[] atgs) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();
            if (str.trim().isEmpty()) {
                System.out.print("error");
                return;
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("write.txt"));
            bw.write(str);
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("write.txt"));
            String line = br.readLine();
            br.close();

            print(line);
        } catch (Exception err) {
            System.out.print("error");
            return;
        }
    }

    public static void print(String line) {
        System.out.print("write:" + line);
    }
}
