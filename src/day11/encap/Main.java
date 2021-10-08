package day11.encap;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        //순서대로 해야하고, 3번을 모두 해야함. 안그럼 차 고장남.
        car.engineStart();
//        car.injectGasoline();
//        car.moveCylinder();
        // 캡슐화 전의 문제점
        // -> 1)순서 헷갈림 2)기능 1개 작동하는데 알아야할게 3개나 있음. 3) 내부적인건데 밖에 나와있음
        car.setMode('D');
        car.accelerator();
//        car.speed = -500; // 외부에서 내부 데이터를 망치고 있음. -> private로 잠궈버림 = "필드에 대한 캡슐화"
        car.accelerator();

//        car.accelerator();car.accelerator();car.accelerator();car.accelerator();car.accelerator();car.accelerator();
//        car.accelerator();car.accelerator();car.accelerator();car.accelerator();car.accelerator();car.accelerator();
//        // 막 밟으면 죽음. 막 못밟게.
//        car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();
//        car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();car.slowdown();
//        // 시속에 음수는 없음. 0 밑으로는 안떨어지게

        //mode
//        car.mode = 'Q'; //-> 이런 이상한 모드 못하게 private으로 막음. => setter

        //지금 주행중인데 현재 속도 알고 싶음
//        System.out.printf("지금 주행 속도는 %dkm/h입니다.\n", car.speed); // -> private이라서 참조 불가 => getter
        System.out.printf("지금 주행 속도는 %dkm/h입니다.\n", car.getSpeed());

        System.out.println("=========================================");

        Driver kim = new Driver();
        kim.getLicense();
        kim.getLicense();
//        kim.license = false; // 이럼 안됨. -> private으로.
        kim.getLicense();

        Dealer park = new Dealer("박뽀로로");
        Dealer lee = new Dealer("이초코송이");
        kim.buyCar(lee, "모닝");
        kim.drive();




    }// end main




}
