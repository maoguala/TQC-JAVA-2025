package JP06;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

class Bag {
    String receiptdate;
    int freight;
    int unitcost;

    Bag() {
    }
}

class Air extends Bag {
    int deliveryhours;

    public void computeFreight() {
        freight = unitcost * deliveryhours;
    }
}

public class J608 {
    public static void main(String args[]) {
        try {
            String pathname = "read.txt";
            File f = new File(pathname);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            Scanner sc = new Scanner(System.in);
            int cost = sc.nextInt();
            sc.close();
            if (cost <= 0) {
                System.out.print("error");
                br.close();
                return;
            }

            String line = "";
            // blow from text
            int total = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 2) {
                    continue;
                }
                Air a = new Air();
                a.receiptdate = parts[0];
                a.deliveryhours = Integer.parseInt(parts[1]);
                a.unitcost = cost;
                a.computeFreight();

                total += a.freight;
                count++;
            }

            br.close();

            if (count == 5) {
                System.out.print(total);
            } else {
                System.out.print("error");
            }

        } catch (Exception e) {
            System.out.print("error");

        }
    }
}
