package day14.poly.car;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        Tucson t = new Tucson(); -> 이렇게 써도 배열에 들어가짐. "자동형변환"됨. (int 써도 double로 되는것처럼)
        Car t = new Tucson();
//        Sonata s = new Sonata();
        Car s = new Sonata();
//        Boxster b = new Boxster();
        Car b = new Boxster();

        //주행테스트
        t.run(); s.run(); b.run();

        System.out.println("-------------------------------------");
        Car[] cars = {t, s, b, new Tucson(), new Boxster()};
        for (Car c : cars) {
            c.run(); //-> 이래서 메서드를 오버라이딩 했음. 공통처리 하기 위해서. (return, 이름 등 다 같아야함.)
        }
        //////////////////////////////////////////////////
        System.out.println("============Driver (오버로딩)================");
        Driver park = new Driver();
//        park.driveSonata(new Sonata());
//        park.driveTucsan(new Tucson());
        //이러다보면 메서드 이름들이 다 달라가지고 헷갈림. 그래서 drive로 통일하고 싶음.
        //-> overloading
        park.drive(new Sonata());
        park.drive(new Tucson());

        //* 오버로딩 예시 -> sout
//        System.out. 이렇게 치고 보면 println 여러 종류. 다 오버로딩
        System.out.println(); //<- 괄호 안에 뭘 써도 다 출력됨. 오버로딩 되어있는것.

        ///////////////////////////
        System.out.println("========================================");
        Car myCar = park.buyCar("소나타");
        myCar.run();

        park.buyCar("박스터").run(); // park.buyCar("박스터") 의 리턴타입이 Car 라서 가능.

        /////////////강제 타입 변환//////////////////
        // 암묵적 형변환
        int a = 10;
//        double d = (double) a;
        double d = a;

        Sonata sn = new Sonata();
//        Car cc = (Car) sn;
        Car cc = sn;

        //강제 형변환
        double dd = 3.5;
        int vv = (int) dd;

        Sonata ss = new Sonata();
        Car ccc = ss;
        Sonata sss = (Sonata) ccc; // 이렇게 해야 가능.

        // casting package에서 이어서 학습.

        //casting 이어서
        Car 내소나타 = park.buyCar("소나타");

//        내소나타.국산세단할인(); // 안됨. 타입이 Car라서.
        //->
        ((Sonata) 내소나타).국산세단할인();


        //일일이 다운캐스팅 안하게, 아예 받을 때 Sonata로 받으면 오리지널로 작성 가능. [핵심]
        //  park.buyCar 리턴타입이 Car라서, 타입 Sonata로 받고, 오는 Car를 (Sonata)로 다운캐스팅 시켜줌.

        Sonata 내소나타2 = (Sonata) park.buyCar("소나타");
        내소나타2.국산세단할인();
        내소나타.run(); // 이것도 가능.

        cars[0] = 내소나타; // 이건 왜쓴지 모르겠음...

        System.out.println("========================");
        ///////// boxster에서 예시2///////////
//        Car 내박스터 = park.buyCar("박스터");
//        내박스터.스포츠카할증();

        //=>
        Boxster 내박스터 = (Boxster) park.buyCar("박스터");
        내박스터.스포츠카할증();

        System.out.println("=============================");
        /////////////////////instanceof/////////////////////////////

        CarShop shop = new CarShop();
        shop.sellCar(new Boxster());
        int money1 = shop.sellCar(new Boxster());
        System.out.println("money = " + money1);

        shop.sellCar(s);
        int money2 = shop.sellCar(s);
        System.out.println("money = " + money2);

        shop.sellCar(t);
        int money3 = shop.sellCar(t);
        System.out.println("money = " + money3);


    }
}
