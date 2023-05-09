class MyPoint{
    private int x;
    private int y;

    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int px, int py){
        this();
        if(px >= 0 && px <= 100 && py >= 0 && py <= 100 ){
            x = px;
            y = py;
        }
    }
    public void setX(int px){
        if(px >= 0 && px <= 100){
            x = px;
        }
    }
    public void setY(int py){
        if(py >= 0 && py <= 100){
            y = py;
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

public class Sample9_P5 {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(30, 100);
        System.out.println(mp1.getX());
        System.out.println(mp1.getY());

        MyPoint mp2 = new MyPoint();
        mp2.setX(20);
        mp2.setY(100);
        System.out.println(mp2.getX());
        System.out.println(mp2.getY());
    }
}
