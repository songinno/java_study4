package day19.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {
    public static void main(String[] args) {

        //Set: 중복 저장 허용x, 순서 없이 저장, 탐색과 저장 속도 빠름.
        Set<String> set = new HashSet<>(); // 대표적인 set
        //Set의 부모 Colletion, List의 부모도 Colletion, 메서드들 비슷할 것.

        //#set에 객체 추가: add(obj)
        boolean b1 = set.add("김말이");
        set.add("닭강정");
        set.add("단무지");
        set.add("김밥");
        boolean b2 = set.add("김말이");

        //#길이: size()
        int size = set.size();
        System.out.println("size = " + size); //=> 4
        System.out.println("set = " + set); // set = [김밥, 김말이, 단무지, 닭강정]
        //-> 순서 뒤죽박죽. 중복 저장 x


        //add의 리턴값 boolean
        System.out.println("b1 = " + b1); //-> true
        System.out.println("b2 = " + b2); //-> false
        System.out.println("====================================");
        //#set의 반복문: iter
        for (String s : set) {
            System.out.println("s = " + s);
        }
        //#iter for문 : 오른쪽에 들어갈수 있는 것들 - 배열,list,set, ...
        //"Iterable" 인터페이스를 상속받으면 쓸 수 있음.

        System.out.println("---------------------------------------");
        //#set의 객체 삭제: remove(obj)
        set.remove("단무지");
        System.out.println("set = " + set);

        set.clear();
        System.out.println("set = " + set);

    }
}
