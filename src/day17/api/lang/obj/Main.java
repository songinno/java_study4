package day17.api.lang.obj;

public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("김철수", 30, "대전시 서구");
        System.out.println(member1); // => day17.api.lang.obj.Member@1b6d3586 -> 메롱
        //-> 이름: 김철수, 나이: 30세, 주소: 대전시 서구
        System.out.println(member1.toString()); // => day17.api.lang.obj.Member@1b6d3586 => 메롱
        //-> 이름: 김철수, 나이: 30세, 주소: 대전시 서구
        // toString()이 숨어있음. 없는데 호출했다는건 상속했다는것.

        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
            print(s);
            newLine();
            }
        }
         */
        /*
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        Member member2 = new Member("박영희", 40, "대전시 유성구");
        System.out.println(member2);

        System.out.println("====소멸자 테스트====");
        Member m = null;
        for (int i = 0; i < 50; i++) {
            m = new Member("바보" + i, i, "대전");
            m = null;
            System.gc(); // 쓰레기 수집가 호출
            //원하는 시점에 삭제시킬 수는 없음. 자바의 한계.

            /////////////////////////////////
            //System -> C언어로 바꿔서 os에 접근할 수 있게 해줌.
            // System 보면 native라고 적혀있음.

            ///////////////////////////////
            // Class 클래스 (클래스 이름이 클래스)
            //주로 동적객체생성.

            ///////////////////////////////


        }
    }
}
