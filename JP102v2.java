package JP01;

import java.util.Scanner;

public class JPA01 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		Scanner sc = new Scanner(System.in);

		try {
			n1 = sc.nextInt();
		} catch (Exception err) {
			n1 = 0;
			sc.next();
			
		}

		try {
			n2 = sc.nextInt();
		} catch (Exception err) {
			n2 = 0;
			sc.next();
			
		}

		sc.close();

		if (n1 % 2 != 0) {
			n1 = 0;
		}

		if (n2 % 2 != 0) {
			n2 = 0;
		}
		
		System.out.println((n1+n2));
	}
}
