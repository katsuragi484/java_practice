import java.io.*;

public class Sample5_P2 {
    public static void main(String[] args)throws IOException{
        System.out.println("整数を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int res = num%2;
        if(res == 0)
            System.out.println(num + "は偶数です。");
        else
            System.out.println(num + "は奇数です。");
        
    }
}
