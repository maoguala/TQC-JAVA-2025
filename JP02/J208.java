package JP02;

import java.util.Scanner;

public class J208 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0;

        try {
            x = sc.nextInt();
            if (x < 1 || x > 9) {
                System.out.print("error");
                sc.close();
                return;
            }
        } catch (Exception e) {
            System.out.print("error");
            sc.close();
            return;
        }

        sc.close();

        // 外層控制行數
        for (int i = 1; i <= x; i++) {
            // 內層控制每行的列數，從大到小
            for (int j = i; j >= 1; j--) {
                // 每個欄位寬度約4，靠左，數字不足兩位補零
                System.out.printf("%d*%d=%02d  ", i, j, i * j);
            }
            System.out.println(); // 換行
        }
    }
}
