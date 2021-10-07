package day10.player;

public class Player {

    // 게임 플레이어
    String name;
    int level;
    int hp;

    //# 생성자

    //2) this() 학습
//    public Player() {
//        System.out.println("1번 생성자");
//        this.name = "이름 없음";
//        this.level = 1;
//        hp = 50 + (level * 2);          //level과 hp가 밑에랑 중복. 중복코드를 없애고싶음.
//        // 선택 폭이 넓은게 2번. 1번 생성자가 중복코드가 많으니까 2번한테 name에 "이름없음" 데이터만 넘겨주면 되지 않을까라고 생각
//    }
    // =>
    public Player() {
        this("이름없음"); // => '나'를 콜함.
        System.out.println("1번 생성자");
    }

    //1) this 학습
//    public Player(String name) {
//        System.out.println("2번 생성자");
//        this.name = name; // this: '나' 로 해석. -> 나의 이름.
//        level = 1;
//        hp = 50 + (level * 2);
//        //this를 다 붙여주는게 정석. 안붙이면 자동으로 붙여줌(매개변수랑 안똑같으면)
//        // name = name 이렇게하면 뭐가 매개변수고 필드인지 구분 못함. 그래서 this를 붙여주는 것.
//    }

    //3)
    public Player(String name) {
        this(name, 1);
        System.out.println("2번 생성자");


    }

    //3)
    public Player(String name, int level) {  // 2번 생성자랑 3번 생성자랑 거의 똑같음.
        System.out.println("3번 생성자");
        this.name = name;
        this.level = level;
        this.hp = 50 + (level * 2);
    }



    public void attack(Player this, Player target) { // 매개변수가 사실 2개임. Player this 가 숨어있음.
//        System.out.println("target = " + target);
//        System.out.println("this = " + this);
        System.out.printf("%s님이 %s님을 공격합니다.\n"
        , this.name, target.name);
        target.hp -= 10;
    }

    //2) this() 학습
    public void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n"
                , this.name, this.level, this.hp);
    }
}
