public class Sample4_P2 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 4;
        System.out.println("0-4は" + (num1-num2) +"です。");

        double pie = 3.14;
        int d = 2;
        System.out.println("3.14*2は" + (pie*d) +"です。");

        int num3 = 5;
        int num4 = 3;
        System.out.println("5/3は" + ((double)num3/(double)num4) + "です。");

        int num5 = 30;
        int num6 = 7;
        System.out.println("30/7のあまりの数は" + num5%num6 +"です。");

        int num7 = 7;
        int num8 = 32;
        int num9 = 5;
        System.out.println("(7+32)/5は" + (double)(num7+num8)/num9 + "です。");
    }
}
