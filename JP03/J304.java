package JP03;
import java.util.Scanner;

public class J304 {

    public static void main(String[] args) {

        int[] scores = {100, 100, 95, 95, 92, 91, 90, 100, 88, 88,
                        87, 87, 90, 91, 85, 80, 81, 82, 82, 89};

        Scanner sc = new Scanner(System.in);
        int num = 0;               // 使用者輸入成績
        int countRemoved = 0;      // 被移除的數量
        double sum = 0;            // 用來計算總和

        try {
            num = sc.nextInt();
        } catch (Exception e) {
            // 若輸入非整數，設為 0
            num = 0;
        }
        sc.close();

        // 檢查 num 是否存在於陣列中
        boolean exists = false;
        for (int score : scores) {
            if (score == num) {
                exists = true;
                break;
            }
        }

        // 若輸入不存在於陣列，視為 0
        if (!exists) {
            num = 0;
        }

        // 移除 num（將等於 num 的成績排除不計）
        for (int score : scores) {
            if (score != num) {
                sum += score;
            } else {
                countRemoved++;
            }
        }

        int validCount = scores.length - countRemoved;
        double avg = (validCount > 0) ? sum / validCount : 0;

        // 四捨五入至小數點第二位
        System.out.printf("%.2f", avg);
    }
}
