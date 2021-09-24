package day01;  // 지우면 안됨.

public class variable { // <- variable 바꾸면 안됨. 파일명과 클래스명일 일치해야함. (현재 파일명 variable.java)

    public static void main(String[] args) {

        // #변수의 선언
        // 자바는 정적 타이핑. 그릇을 먼저 준비해서 음식을 담음. (<->동적 타이핑 : 요리를 가져오면 그거에 맞게 그릇을 가져옴 ex)var )

        int score; // 정수

        // #변수의 초기화
        score = 3; //(3.5 <- 실수 넣으면x)

        //#출력
        System.out.println(score);

        // #한줄로
        int life = 50;
        System.out.println(life);
        // #값변경
        life = 100;
        System.out.println(life);

        // #soutv
        int triple = score * 3;
        System.out.println("triple = " + triple); // soutv
        System.out.println("triple * 3 = " + triple * 3);
//eee
        // #정수: int, 실수:double, 문자열: string
        String nickName = "짹짹이";

        // #타입에 맞지 않는 값은 저장 불가.
        // ex) nickName = 100; -> X

        // #변수 이름 중복 선언 불가.
        //double score = 30.5; -> X

        // #선언이나 초기화 되지 않은 변수는 사용 불가.
//        int result;
//        System.out.println(result); // js에서는 undefined

        // # 특수문자는 $ _ (O), 숫자로 시작X, 띄어쓰기X, 키워드(if 등)X
    }



}
