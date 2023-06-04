class Car{
    private int num;
    private double gas;

    public Car(){
        System.out.println("車を作成しました。");
    }

    public void setCar(int num,double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("ナンバーを" + this.num + "にガソリン量を" + this.gas +"にしました。");
    }

    public String toString(){
        String str = "ナンバー" + num + "ガソリン量" + gas + "の車";
        return str;
    }
}

public class Sample11_P4 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        System.out.println(car1 + "です。");
    }
}
