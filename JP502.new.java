package JP05;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JPA05 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			/*
			if (input.trim().isEmpty()) {
				System.out.print("error");
				return;
			}*/
			sc.close();
			FileWriter fw = new FileWriter("write.txt");
			FileReader fr = new FileReader("write.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(fr);
			bw.write(input);
			bw.close();
			String GetStr = br.readLine();
			print(GetStr);
			
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
		
	}

	public static void print(String line) {
		System.out.print("write:" + line);
	}
}
