import java.io.*;

public class Sample3_P5 {
    public static void main(String[] args)throws IOException{
        System.out.println("身長と体重を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();

        double db1 = Double.parseDouble(str1);
        double db2 = Double.parseDouble(str2);

        System.out.println("身長は" + db1 + "センチです。");
        System.out.println("体重は" + db2 + "キロです。");
    }
}
