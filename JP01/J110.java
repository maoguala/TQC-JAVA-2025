package JP01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J110 {
    public static void main(String[] args) {
		int od = 0, fd = 0, td = 0, total = 0; // one dollar, five dollar, ten dollar;
		Scanner sc = new Scanner(System.in);

		try {
			od = sc.nextInt();
			if (od < 0) {
				od = 0;
			}
		} catch (InputMismatchException e) {
			od = 0;
			sc.next();
		}
		try {
			fd = sc.nextInt();
			if (fd < 0) {
				od = 0;
			}
		} catch (InputMismatchException e) {
			fd = 0;
			sc.next();
		}

		try {
			td = sc.nextInt();
			if (td < 0) {
				od = 0;
			}
		} catch (InputMismatchException e) {
			td = 0;
			sc.next();
		}

		sc.close();

		total = (od * 1) + (fd * 5) + (td * 10);
		System.out.printf("%,3d\n", total);
	}
}
