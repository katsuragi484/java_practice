import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4_P5 {
    public static void main(String[] args)throws IOException{
        System.out.println("科目1~５の点数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);
        sum += Integer.parseInt(str4);
        sum += Integer.parseInt(str5);
        
        System.out.println("5科目の合計点は" + sum + "点です。");

        double ave = (double)sum/5;       
        System.out.println("5科目の平均点は" + ave + "点です。");
    }
}
