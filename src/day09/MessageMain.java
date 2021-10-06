package day09;

import day08.Phone;

public class MessageMain {
    public static void main(String[] args) {
        Phone haptic = new Phone("햅틱2"); // 다른 패키지에 있는 거 호출하려고 public 붙임.

        Phone chocolate = new Phone("초콜릿폰");

        haptic.powerOn();
        haptic.sendMessage(chocolate, "안녕하세요");
        haptic.sendMessage(chocolate, "gdgdgdgd");
        haptic.sendMessage(chocolate, "zzzzzzzzzzzzzzzzz");
        haptic.sendMessage(chocolate, "zxxzxx");

        chocolate.powerOn();
        chocolate.checkMessages();

        chocolate.sendMessage(haptic, "답장합니다");
        haptic.checkMessages();

        chocolate.showSpec();

        System.out.println("==============================================");

        Person park = new Person("박뽀삐", haptic);// 뽀삐한테 누가 쓰던 햅틱줌 (중고폰)
        Person kim = new Person("김뽀로로", new Phone("아이폰14"));

        // 뽀삐가 뽀로로한테 문자 보내고 싶음. 지금 아직 문자 보내는법 모름. -> 기능 만들어줘야함.

        kim.contact(park, "햅틱 좋냐");
        park.check(); // -> 중고폰이라 이전에 받았던 문자가 남아있음.
    }
}
