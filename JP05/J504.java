package JP05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class J504 {
    public static void main(String[] atgs) {

        String[] new_student = { "Sam", "1981/10/1", "A234567890" };

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sc.close();

            if (input.isEmpty()) {
                System.out.print("error");
                return;
            }

            String getNum[] = input.split(" ");

            if (getNum.length != 3) {
                System.out.print("error");
                return;
            }

            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(getNum[i]) < 0 || Integer.parseInt(getNum[i]) > 100) {
                    System.out.print("error");
                    return;
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("write.txt"));

            String fullStr = String.join(",", new_student);
            String fullNumStr = String.join(",", getNum);
            fullStr = fullStr + "," + fullNumStr;
            bw.write(fullStr);
            // bw.newLine();
            bw.close();

            System.out.print(fullStr); // Very Important!!!

        } catch (Exception err) {
            System.out.print("error");
            return;
        }
    }
}
