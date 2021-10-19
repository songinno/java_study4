package day14.poly.car;

public class Driver {
//    public void driveSonata(Sonata s) {
//        System.out.println("운전을 시작합니다.");
//        s.run();
//    }
//    public void driveTucsan(Tucson t) {
//        System.out.println("운전을 시작합니다.");
//        t.run();
//    }

//    public void drive(Sonata s) {
//        System.out.println("운전을 시작합니다.");
//        s.run();
//    }
//    public void drive(Tucson t) {
//        System.out.println("운전을 시작합니다.");
//        t.run();
//    }

    // 오버로딩 - 메서드 이름이 같아서, 매개변수가 달라야 메서드 구분이 가능.

    //그런데, 차 종이 3000개면, dirve 메서드를 3000개 만들어야함.

    /*
    void add (int n) 를 호출할 때
        add(3);
    => int n = 3;

    Sonata s = s
    Tucson t = new Tucson();

    그러면 Car t = new Tucson();
     */

//=>
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
    c.run();
    }

    ////////////////////////
    //리턴 타입

    public Car buyCar(String carName) {
        if(carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        }
        else if(carName.equals("투싼")) {
            System.out.println("투싼을 구매합니다.");
            return new Tucson();
        }
        else if(carName.equals("박스터")) {
            System.out.println("박스터를 구매합니다.");
            return new Boxster();
        }
        else {
            System.out.println("없는 차량입니다.");
            return null;
        }

    }
}
