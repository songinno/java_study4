package day14.poly.car;

public class Tucson extends Car{

    @Override
    public void run() {
        System.out.println("투싼이 달립니다.");
    }

    @Override
    public void downSpeed() {
        System.out.println("속도를 줄입니다.");
    }
}
