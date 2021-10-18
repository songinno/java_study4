package day13.static_;

public class Main {
    public static void main(String[] args) {
        //(1)
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;
        System.out.println("c1.x: " + c1.x);

        Count c2 = new Count();
        c2.x++;
        System.out.println("c2.x: " + c2.x);

        c2.x++;
        Count.y--;

        System.out.println("c2.x = " + c2.x);

        System.out.println("c2.y = " + c2.y);
        System.out.println("c1.y = " + c1.y);
        // c1과 c2는 다른건데, c2.y-- 했는데 c1.y의 값이 -1됨. c2.y도 -1이 아니라 10에서 -1

        // => static(y): 값이 객체가 아니라, 클래스에 고정되어있음.
        // 그래서 c1.y, c2.y 앞에 c1, c2 이거 의미가 없음. -> 클래스 이름으로 써버림 -> Count.y
        //ex) korean이라는 클래스, 필드 '국적' -> static

        System.out.println("===========================================================================");
        //(2)
        c1.m1();
        c2.m1();

        Count.m2();
        Count.m2();
        ///////////////////////////////////////////////////
        //class 학생
        학생 김철수 = new 학생();
        학생 박영희 = new 학생();

        김철수.전공 = "경영학과";
        박영희.전공 = "수학과";

        김철수.전공을물어보다();
        박영희.전공을물어보다();

//        김철수.국적을물어보다();
//        박영희.국적을물어보다();

        학생.국적을물어보다(김철수);


    }
}
