package day18.api.time;

import java.time.*;

public class LocalTimeBasic {
    public static void main(String[] args) {

        // 오늘 날짜가 2021-10-25 인데, dvd대여, 도서관 대여 시스템을 만들려할때 어떤 회원이 어떤날짜에 가져갔는가 : 대여일
        //정책상 7일 후 반납해야함: 반납일. 대여일 기준으로 반납일을 계산해야함.
        //=>

        //날짜 정보 제어
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        //임의의 날짜 정보 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 4);
        System.out.println("targetDate = " + targetDate);

        //시간 정보 제어
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalTime targetTime = LocalTime.of(20, 0, 3);
        System.out.println("targetTime = " + targetTime);

        //날짜 + 시간정보 제어
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        //현재 시간의 밀리초
        long nowTimeMs = System.currentTimeMillis();
        System.out.println("nowTimeMs = " + nowTimeMs); // 16351357'32' 865 -> 32가 초.
        //-> 유닉스 타임. 1970-01-01 00:00:00초 기준, 현재까지 흘러간 시간 단위(밀리초)
        //컴퓨터가 시간계산을 하는 기준.
        //1970-01-01 00:00:00으로부터 16억초 넘게 지난것.
        //System.currentTimeMillis 이거는 커지기만함. 안줄어듦.

        //각 날짜와 시간 정보를 추출
        int year = now.getYear();
        System.out.println("year = " + year);
        Month month = now.getMonth();
        System.out.println("month = " + month); // 숫자 아님.
        int monthValue = now.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        DayOfWeek dayOfWeek = now.getDayOfWeek();

        String weekDay = "";
        switch (dayOfWeek) {
            case MONDAY: weekDay = "월요일"; break;
        }
        System.out.println("dayOfWeek = " + dayOfWeek);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        int dayOfYear = now.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);
    }

}
