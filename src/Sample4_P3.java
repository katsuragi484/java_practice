import java.io.*;

public class Sample4_P3 {
    public static void main(String[] args)throws IOException{
        System.out.println("正方形の辺の長さを入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int side = Integer.parseInt(str);

        System.out.println("正方形の面積は" + side*side +"です。");
    }
}
