package day12.inherit;

public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior();

        // 게임 정책상 level을 없애기로 함. -> 직업 클래스마다 다 없애줘야함.
        // 공통 필드, 메서드를 Player에 갖다 놓고, 직업 클래스로 가서 다 지움.
        // extends Player 추가 -> Player에서만 level 지워주면 다 지워짐.

        w.name = "주차왕파킹";
        w.level = 1;
        w.hp = 50;
        w.rage = 100;

        w.info();
        w.attack();
        w.fireSlash(); // 이건 원래 얘꺼

        // 실제로 물려주는게 아니라, Warrior객체가 있고, Player객체 둘이 링크를 걸어서, 두개의 객체를 하나처럼 사용. 메모리 2개씀.
        // Warrior에는 여전히 rage밖에 없음.
        // => Player 객체 생성됨. Warrior 객체 생성됨.
        /*
        new -> Heap에다가 할당하는거.
        heap에 Warrior 객체 만들어짐. 거기에 필드 rage공간 있음.
        메모리 주소값 120번지. Stack에 변수 w (120)
        Warrior 안에 this 필드 120번지

        그 전에 상위 클래스 Player 객체 자동생성됨(200번지).거기에  name, level, hp 들어옴.
        (자동 생성: super(); -> 이 코드가 숨어있는 것.)

        w.name = "" 하면 Player에 저장되는 것.
        사실 warrior에 super라는 필드 숨어있음. 거기 번지가 200. 거길 통해서 w.name이 가능.
         */

        //Player도 부모가 있음. (extends Object가 생략되어 있는 것.)
        Player p = new Player();
        //p. 해보면 안만든 메서드들 보임. (equals 등등)
        //Warrior도 Object거 쓸 수 있음.

        //Warrior도 자식들 둘 수 있음. 줄줄이 상속됨.
        // 하지만, 부모를 2개 이상 둘 수 없음. (*다중상속 불가. 기본 기능에서는 안되는데 인터페이스에서 할수는 있음.)
        // 다중상속 왜 막아놨냐 -> '죽음의 다이아몬드'

        System.out.println("============================");
        Knight k = new Knight();
        // -> Player 객체 생성됨. Warrior 객체 생성됨.나이트 객체 생성.

        /////////////////////////////////////////////////////////////
        // ** 오버라이딩
        // w.info(); 에 rage가 안나옴. 맘에 안듦. -> 오버라이딩
        System.out.println("--- 오버라이딩 ---");
        w.info();
        Mage mage = new Mage("마법사");
        mage.info();
        Hunter hunter = new Hunter("밀렵꾼", "멍멍이");
        hunter.info();

        // 단축키 (alt + 1) -> 왼쪽 창 열고 닫음.

        //////////////////////////////////////////////////////////////
    }
}
