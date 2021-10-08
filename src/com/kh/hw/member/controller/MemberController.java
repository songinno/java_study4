package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

    //필드
    public static final int SIZE = 10;
    private Member[] m = new Member[SIZE];

    //더미데이터
    public MemberController() {
        m[0] = new Member("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'F', 33);
        m[1] = new Member("bbbbb", "강고결", "bb", "bbb@bbb.bbb", 'm', 34);
        m[2] = new Member("ccccc", "남나눔", "cc", "ccc@ccc.ccc", 'M', 28);
        m[3] = new Member("ddddd", "박신우", "dd", "ddd@ddd.ddd", 'f', 100);
    }
    /////////////////////////////////////////////////////////////

    /**
     * 현재 존재하는 멤버 수 반환하는 메서드
     * @return -
     */
    public int existMember() {
        int count = 0;
        for (Member member : m) {
            if(member == null) break;
            count++;
            }
        return count;
    }

    /**
     *ID중복을 확인하는 메서드
     * @return - 중복이면 true, 중복 아니면 false
     */
    public Boolean checkId(String inputId) {
        for (Member member : m) {
            if (member == null) break;
            if (inputId.equals(member.getId())) {
                return true;
            }
        }
        return false;
    }

    //* Member객체를 객체배열에 저장하는 메소드
    public void insertMember(String id, String name, String password, String email, String gender, int age) {
        int count = existMember();

    }

    /**
     * 아이디를 입력하면 해당 회원의 정보를 반환
     */
    public Member searchId(String id) {
        for (Member member : m) {
            if (member == null) break; // null.getId하면 에러남. 이거 해줘야함.
            if(id.equals(member.getId())) {
                return member;
            }
        }
        return null; //-> 없는 아이디 입력했을 때
    }

    /**
     * 이름 입력하면 그 이름에 해당하는 모든 회원정보 리턴 (동명이인이라 리턴 타입이 Member[])
     * @param name
     * @return
     */
    // 이름 매칭된 회원들을 저장할 배열
    Member[] foundMembers = {};
    public Member[] searchName(String name) {
        for (Member member : m) {
            if (member == null) break; // null.getId하면 에러남. 이거 해줘야함.
            if(name.equals(member.getName())) {
                foundMembers = pushMember(foundMembers,member);
            }
        }
        return foundMembers; //-> 없는 아이디 입력했을 때
    }

    // $멤버배열 맨 끝에 데이터를 추가하는 메서드 (바로 위에꺼 하려고 만듦)
    private Member[] pushMember(Member[] targets, Member newMember) {
        Member[] newArr = new Member[targets.length + 1];
        for (int i = 0; i < targets.length; i++) {
            newArr[i] = targets[i];
        }
        newArr[targets.length] = newMember;
        return newArr;
    }


    // *이메일로 회원 조회하는 메서드
    public Member[] searchEmail(String email) {
        return null;
    }

    // *비밀번호 변경 메서드
    public Boolean updatePassword(String id, String password) {
        for (Member member : m) {
            if (member == null) break;
            if (id.equals(member.getId())) {
                member.setPassword(password);
                return true;
            }
        }
        return false;
    }

    public Boolean updateName(String id, String name) {
        return false;
    }

    public Boolean updateEmail(String id, String email) {
        return false;
    }


    // * id를 입력하여 회원삭제시키는 메서드
    public Boolean delete(String id) {
        for (Member member : m) {
            if (member == null) break;
            if (member.getId() == id) {

            }
        }
        return false;
    }
    // [a,b,c,d,0,0,0,0,0,0] -> [a,c,d,0,0,0,0,0,0,0]
    // + 배열 데이터 삭제 메서드
    private Member[] abcde() {
        Member temp[] = new Member[m.length - 1];
        for (int i = 1; i < temp.length; i++) {
            temp[i] = m[i+1];
        }
        return null;
    }






    // *전체 회원 삭제 메서드
    public void delete() {

    }

    public Member[] printAll() {
        return null;
    }


}//end class
