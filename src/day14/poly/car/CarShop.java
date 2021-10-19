package day14.poly.car;

import javax.swing.*;

public class CarShop {
    //instanceof
    public int sellCar(Car car) { // 들어올 수 있는 객체 3개. 뭐 들어왔는지 확인이 안됨.
        if (car instanceof Sonata) { // 왼쪽에는 변수, 오른쪽에는 데이터 타입.
            return 2000;
        } else if (car instanceof Tucson) {
            return 2400;
        } else if (car instanceof Boxster) {
            return 7000;
        } else {
            return 0;
        }
    }
}
