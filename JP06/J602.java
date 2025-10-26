package JP06;

import java.util.Scanner;

enum color {
	RED, BLUE, WHITE
}

class Car {
	int cc;
	int seats;
	color colors;
	int doors;

}

public class J602 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		try {
			String input = sc.nextLine();
			sc.close();
			String GetNum[] = input.split(" ");
			if (GetNum.length != 4) {
				System.out.print("error");
				return;
			}
			if (Integer.parseInt(GetNum[2]) > 3 || Integer.parseInt(GetNum[2]) < 1) {
				System.out.print("error");
				return;
			}

			Car c = new Car();
			c.cc = Integer.parseInt(GetNum[0]);
			c.seats = Integer.parseInt(GetNum[1]);
			int colorsNum = Integer.parseInt(GetNum[2]);
			c.doors = Integer.parseInt(GetNum[3]);

			if (colorsNum == 1) {
				c.colors = color.RED; // It will convert to String within toString()
			} else if (colorsNum == 2) {
				c.colors = color.BLUE;
			} else if (colorsNum == 3) {
				c.colors = color.WHITE;
			} else {
				System.out.print("error");
				return;
			}
			
			System.out.print(c.cc +"cc"+ c.seats + c.colors + c.doors);
			
		} catch (Exception error) {
			System.out.print("error");
			return;
		}

	}
}
