package day13.final_;

public class Main {
    public static void main(String[] args) {

        Korean kim = new Korean("김철수", "010101-1234567");
        kim.name = "김바보";
//        kim.sid = "123132132-131232113"; //-> 불가 (final이라서)
//        kim.nation = "미국"; //-> 안됨.

        Korean park = new Korean("박영희", "910101-2234567");

        /*
        final을 붙인다고 상수는 아님.
            상수의 조건
            1) 불변성
            2) 유일성 -> 만족x (김철수, 박영희의 주민번호 다름)
        static final -> 상수 o (final = 불변성, static = 유일성)
        관례) 상수 이름은 대문자 + 스네이크케이스를 사용
            ex) MY_NATION



         */

        System.out.println(kim.toString());
        System.out.println(park.toString());


    }
}
