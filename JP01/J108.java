package JP01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class J108 {
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);

        try {

            x = sc.nextDouble();
            x = 2 * Math.pow(x, 3) + 3 * x - 1;
            System.out.printf("%.4f", x);

        } catch (InputMismatchException e) {

            System.out.println("error");

        } finally {

            sc.close();

        }
    }
}
