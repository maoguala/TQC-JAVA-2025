package JP05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class J506 {
    public static void main(String[] args) {

        try {
            String path = "read.txt"; // 檔案來源
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            // 將所有行讀入 ArrayList
            ArrayList<String> data = new ArrayList<String>();
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            br.close();

            Scanner sc = new Scanner(System.in);
            int judge = sc.nextInt(); // 讀入欲刪除編號
            sc.close();

            // 編號範圍檢查
            if (judge < 1 || judge > data.size()) {
                System.out.print("error");
                return;
            }

            // 找到要刪除的那行
            String target = data.get(judge - 1);
            String[] parts = target.split(",");

            // 刪除該筆資料
            data.remove(judge - 1);

            // 將剩下的資料寫入 write.txt
            BufferedWriter bw = new BufferedWriter(new FileWriter("write.txt"));
            for (String d : data) {
                bw.write(d);
                bw.newLine();
            }
            bw.close();

            // 輸出刪除訊息
            System.out.print("Delete:" + parts[0] + " " + parts[1]);

        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}
