import java.io.*;

public class Sample10_p2 {
    public static void main(String[] args)throws IOException {
        System.out.println("文字列を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer rstr = new StringBuffer();
        rstr.append(str);
        System.out.println(str + "を逆順にすると" + rstr.reverse() + "です。");
    }    
}
