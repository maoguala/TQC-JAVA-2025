package JP01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class J102 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, sum = 0;
        Scanner sc = new Scanner(System.in);

        try {
            num1 = sc.nextInt();
        } catch (InputMismatchException e) {
            num1 = 0;
            sc.next();
        }

        try {
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            num2 = 0;
            sc.next();
        }
        sc.close();

        if (num1 % 2 == 0) {
            sum += num1;
        } else {
            num1 = 0;
            sum += num1;
        }

        if (num2 % 2 == 0) {
            sum += num2;
        } else {
            num2 = 0;
            sum += num2;
        }

        System.out.println(sum);
    }
}