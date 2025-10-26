package JP04;

import java.util.Scanner;

public class J408 {
    public static void main(String[] args) {
        String t = "";
        Scanner sc = new Scanner(System.in);

        t = sc.nextLine();
        if (!t.contains(":")) {
            System.out.print("error");
            sc.close();
            return;
        }

        String p[] = t.split(":");

        if (p.length != 2) {
            System.out.print("error");
            sc.close();
            return;
        }

        try {
            int h = Integer.parseInt(p[0]);
            int m = Integer.parseInt(p[1]);

            if (m < 0 || m >= 60) {
                System.out.print("error");
                sc.close();
                return;
            }

            int all_d = h / 8;
            int all_h = h % 8;
            int all_m = m;

            System.out.printf("%dd:%dh:%dm", all_d, all_h, all_m);

        } catch (NumberFormatException NumErr) {
            System.out.print("error");
            sc.close();
            return;
        }

        sc.close();
    }
}
