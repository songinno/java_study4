package day02;

public class BitOperator {
    public static void main(String[] args) {

        // #비트 연산   (실제 코딩때는 쓸일 거의 없는데, 시험에 나옴)
        byte a = 5; // 2진수로 : 00000101
        byte b = 3; // 2진수로 : 00000011

        // *비트곱 : 각 자리수를 곱하세요.
        System.out.println(a & b); // 00000001 -> 10진수로 : 1
        // *비트합 : 각 자리수를 더하세요. 단, 1+1 = 1로 처리.
        System.out.println(a | b); // 00000111 -> 10진수로 : 1+2+4 = 7
        // *배타적 논리합 : 다르면 1, 같으면 0
        System.out.println(a ^ b); // 00000110 -> 10진수로 : 2+4 = 6
        // *비트 이동 연산
        // -왼쪽방향:2의 이동숫자 제곱만큼 곱하세요
        // -오른쪽방향:2의 이동숫자 제곱만큼 나누세요
        int x = 192;
        System.out.println(x << 3); // 192*8 = 1536
        System.out.println(x >> 2); // 192/4 = 48

        // *비트 반전 : -9가 나오는게 중요한게 아님. 그냥 비트가 반전된다는 것.
        int y = 8;  // 00001000
        System.out.println(~y); // 11110111
    }
}
