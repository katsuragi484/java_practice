class MyPoint{
    int x;
    int y;

    void setX(int px){
        x = px;
    }
    void setY(int py){
        y = py;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}

public class Sample8_P5 {
    public static void main(String[] args) {
        MyPoint mp = new MyPoint();
        mp.setX(10);
        mp.setY(20);
        int x = mp.getX();
        int y = mp.getY();
        System.out.println("x座標は" + x + "y座標は" + y);
    }
}
