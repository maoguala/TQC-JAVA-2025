package JP03;

import java.util.Scanner;

public class J308 {
    public static void main(String[] args) {

		int[] scores = { 100, 100, 95, 95, 92, 91, 90, 100, 88, 88, 87, 87, 90, 91, 85, 80, 81, 82, 82, 89 };
		// To Do
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			// TO DO
			num = sc.nextInt();
			if(num < 0 || num > 100)
			{
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
		
		int catch_times = 0;
		for(int target : scores) //compare with the index of elements
		{
			if(num == target)
			{
				catch_times++;
			}
			
		}
		
		System.out.printf("%d", catch_times);
	}
}
