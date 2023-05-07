class Car{
    int num;
    double gas;

    void setNumGas(int n, double g){
        num = n;
        gas = g;
        System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
}

public class Sample8_5 {
    public static void main(String[] args) {
        Car car1 = new Car();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }
}
