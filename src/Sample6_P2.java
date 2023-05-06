import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample6_P2 {
    public static void main(String[] args)throws IOException{
        System.out.println("テストの点数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int score = 0;
        do{
            String str = br.readLine();
            score = Integer.parseInt(str);
            total += score;
        }while(score != 0);
        System.out.println("テストの合計点は" + total + "点です。");
    }
}
