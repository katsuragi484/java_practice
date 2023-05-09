class Car{
    private int num;
    private double gas;

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");  
    }
    public Car(int n, double g){
        this();
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    public void show(){
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

public class Sample9_6 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.show();

        Car car2 = new Car(1234,20.5);
        car2.show();
    }
}

