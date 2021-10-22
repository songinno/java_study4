package day17.api.lang.wrapper;

public class Wrapper {

    /*
    <java>
    객체지향언어
    모든게 객체는 아님. 기본타입들. 8가지. 사실 객체 맞음-> 그걸 증명?해주는게 wrapper
    왜 넣었냐. c언어와의 호환.
     */

    static int x; // 얘의 기본값은 0
    static Integer y; // 기본값 null
    //결국 둘다 정수. 큰 차이는 없음. 객체지향 패러다임을 지향?하기 위해, 거기 맞추기 위해 만든거.

    public static void main(String[] args) {
        x = 10; y = 20;
        x=y;
        y=x;
        //상호 변환 자유로움.
        //=> 결국 둘이 크게 다른게 없다...

        //*문자열 -> 기본타입으로 변환
        String s1 = "90";
        String s2 = "5.5";
        //둘이 더해서 95.5 나오게 하고 싶음.
        System.out.println(s1 + s2);

        System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2));//-> 이렇게.

        //필드의 초기값을 0으로 두고 싶지 않을 때도 Wrapper 씀 (int대신 Integer)
     }


}
