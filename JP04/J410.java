package JP04;

import java.util.Scanner;

public class J410 {
    public static void main(String[] args) {

        String[] birthday = {
                "1980/1/11", "1985/3/2", "1985/12/3", "1986/6/3", "1986/11/14",
                "1987/2/2", "1987/8/1", "1987/10/12", "1987/9/3", "1987/8/1",
                "1987/4/12", "1988/1/3", "1987/5/6", "1987/6/7", "1987/8/19",
                "1987/6/13", "1987/10/9", "1986/4/8", "1987/5/15", "1987/2/19",
                "1987/3/15", "1987/3/11", "1987/3/31"
        };

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 輸入月份
            sc.close();
            int count = 0;

            // 判斷月份是否合理
            if (n < 1 || n > 12) {
                System.out.print("error");
                return;
            }

            // 遍歷所有生日
            for (int i = 0; i < birthday.length; i++) {
                // 切割日期字串，取出月份部分
                String[] parts = birthday[i].split("/");
                int month = Integer.parseInt(parts[1]);

                if (month == n) {
                    count++;
                }
            }

            System.out.print(count); // 不自動換行
        } catch (Exception err) {
            System.out.print("error");
        }
    }
}
