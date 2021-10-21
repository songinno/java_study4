package day16.exception; //3

public class FinallyExample {
    public static void main(String[] args) {

        try {
            String s = null;
            s.equals("hello");
            System.out.println("s는 hello와 같다.");
        } catch (Exception e) {
            System.out.println("Null Pointer 예외 발생!");
        } finally {
            System.out.println("메롱");
        }
        //try가 정상실행 => catch 실행x --> finally 실행o
        //try 실행x => catch 실행o --> finally 실행o

        //#finally
        //ex) database에서 에러가 나던 안나던, 연결 종료(자원반납) 같은 경우에 쓰임.




    }
}
