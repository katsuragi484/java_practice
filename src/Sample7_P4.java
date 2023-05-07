import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample7_P4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];
        int max = 0;
        System.out.println(score.length + "人のテストの点数を入力してください。");

        for(int i=0; i<score.length; i++){
            String str = br.readLine();
            score[i] = Integer.parseInt(str);
            if(score[i] > max){
                max = score[i];
            }
        }
        for(int i=0; i<score.length; i++){
            System.out.println((i+1) + "番目の人の点数は" + score[i] + "です。");
        }
        System.out.println("最高点は" + max + "点です。");
    }
}
