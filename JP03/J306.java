package JP03;

import java.util.Scanner;

public class J306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = new int[2][3];

        String line = sc.nextLine();
        sc.close();
        String[] parts = line.trim().split(" ");

        // 檢查是否輸入六個數字
        if (parts.length != 6) {
            System.out.println("error");
            return;
        }

        // 解析輸入並檢查範圍
        try {
            int index = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    int num = Integer.parseInt(parts[index]);
                    if (num < 1 || num > 100) {
                        System.out.println("error");
                        return;
                    }
                    b[i][j] = num;
                    index++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("error");
            return;
        }

        int[][] result = compute(a, b);
        print(result);
    }

    public static int[][] compute(int[][] a, int[][] b) {
        int[][] sum = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
