package JP02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J204 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        for (int i = 0; i < 2; i++) {
            try {
                num[i] = sc.nextInt();

                // 範圍檢查
                if (num[i] <= 0 || num[i] > 100) {
                    System.out.println("error");
                    sc.close();
                    return; // 終止程式
                }
            } catch (InputMismatchException e) {
                System.out.println("error");
                sc.close();
                return;
            }
        }
        sc.close();

        // 確定起點與終點
        int start = Math.min(num[0], num[1]);
        int end = Math.max(num[0], num[1]);

        // 1 不是質數，從 2 開始
        if (start < 2) start = 2;

        // 列出範圍內的質數
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
}
public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
