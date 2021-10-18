package day13.static_;

public class 학생 {

    public String 전공;
    public static String 국적 = "대한민국";

    public void 전공을물어보다() {
        System.out.println("나의 전공: " + 전공);
    }

    public static void 국적을물어보다(학생 못난이학생) {
        System.out.println("나의 국적: " + 국적);
//        System.out.println("나의 전공: " + 전공); //-> 참조 불가.
        System.out.println("나의 전공: " + 못난이학생.전공); //매개변수 받아서는 가능.
    }

    // sataic 메서드 안에서는 static이 아닌 필드나 메서드를 직접 참조할 수 없다.


}
