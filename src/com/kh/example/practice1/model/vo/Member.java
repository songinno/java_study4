package com.kh.example.practice1.model.vo;
// 클래스 이름 긴 이유 : 중복 최소화
//절대 중복 없는거: 도메인 주소 (www.naver.com) 세계에서 1개. -> 패키지 만들때 붙임. (com.naver 이렇게 거꾸로 씀 - root 패키지 or 그룹id)
//com.kh => 도메인 주소 (그룹id \ root패키지)
//example: 프로젝트 이름.
// 그다음부터는 성격에 따라서 정함. 의미대로.

public class Member {
    //(기호) -: private, +: public, ~: default, #: protected

    //------------------ # 필드 ------------------
    private String memberId;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String phone;
    private String email;

    //------------------ # 생성자 ------------------
    public Member () {
        this.memberName = "아무개";
    }

    //------------------ # 메서드 ------------------
    public void changeName (String name) {
        this.memberName = name;
    }
    public void printName () {
        System.out.println("이름: " + this.memberName);
    }


}//end class
