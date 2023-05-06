import java.io.*;

public class Sample5_P4 {
    public static void main(String[] args)throws IOException{
        System.out.println("0から10までの整数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        if(res <= 10 && res >= 0){
            System.out.println("正解です。");
        }
        else{
            System.out.println("まちがいです。");
        }
    }
}
