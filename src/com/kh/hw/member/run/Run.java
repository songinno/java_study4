package com.kh.hw.member.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        MemberController mc = new MemberController();

        int existMember = mc.existMember();
        System.out.println(existMember);

        //*아이디를 입력하면 해당 회원의 정보를 반환
        Member member = mc.searchId("ccccc");
        System.out.println(member.inform());

        System.out.println("======================================");

        //* 이름 입력하면 그 이름에 해당하는 모든 회원정보 리턴
        Member[] members = mc.searchName("박신우");
        for (Member member1 : members) {
            String inform = member1.inform();
            System.out.println(inform);
        }
        System.out.println("======================================");
        // *비밀번호 변경 메서드
        mc.updatePassword("bbbbb", "bb123");

        Member memberB = mc.searchId("bbbbb");
        System.out.println(memberB.inform());





    }//end main

}
