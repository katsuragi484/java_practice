import java.io.*;

public class Sample5_P5 {
    public static void main(String[] args)throws IOException{
        System.out.println("成績を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int score = Integer.parseInt(str);

        switch(score){
            case 1:
            System.out.println("もっとがんばりましょう。");
            break;

            case 2:
            System.out.println("もう少しがんばりましょう。");
            break;

            case 3:
            System.out.println("さらに上をめざしましょう。");
            break;

            case 4:
            System.out.println("たいへんよくできました。");
            break;

            case 5:
            System.out.println("たいへん優秀です。");
            break;

        }
    }
}
