package JP04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class J406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int seed = sc.nextInt();
            sc.close();
            if (seed >= 1 && seed <= 100) {
                ArrayList<Integer> a = new ArrayList<Integer>();
                Random r = new Random(seed);

                while (a.size() < 10) {
                    int temp = r.nextInt(100) + 1;
                    sc.close();
                    if (!a.contains(temp)) {
                        a.add(temp);
                    }
                }

                for (int n : a) {
                    System.out.print(n + " ");
                }
            } else {
                System.out.print("error");
                return;
            }
        } catch (Exception err) {
            System.out.print("error");
            return;
        }
    }
}
