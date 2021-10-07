package day10.player;

public class main {

    public static void main(String[] args) {

        Player park = new Player("주차왕파킹");
        Player show = new Player("공연왕쇼킹");

        System.out.println("show = " + show);
        park.attack(show);
        // 둘이 주소값 같음.

        System.out.println("park = " + park);
        show.attack(park);
        // 둘이 주소값 같음.

        System.out.println("=====================");
        //2) this()학습
        Player noname = new Player();
        noname.info();
        Player name2 = new Player("하이");
        name2.info();
        Player name3 = new Player("하이하이", 10);
        name3.info();
    }
}
