package day14.poly.player;

import day12.inherit.Hunter;
import day12.inherit.Warrior;

public class Main {
    public static void main(String[] args) {

        Warrior powerMan = new Warrior("짱짱센전사"); //day12꺼

        powerMan.fireSlash(new Mage("불쌍한마법사"));
        System.out.println("-----------------------------");
        powerMan.fireSlash(new Hunter("수상한밀렵꾼", "살쾡이"));
        System.out.println("-----------------------------");
        powerMan.fireSlash(new Warrior("주차왕파킹"));

        //직업별로 받는 데미지 다르고, 실제 필드 값(hp)가 내려가야함.



    }
}
