package day18.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
    public static void main(String[] args) {
        //대여일: 오늘
        LocalDate now = LocalDate.now();
        System.out.println("오늘날짜 = " + now);

        //반납일: 3일 뒤
        LocalDate orderDate = LocalDate.now();
        LocalDate returnDate = orderDate.plusDays(7);
        System.out.println("returnDate = " + returnDate);
        //반대는 minusDays

        //오늘로부터 2년 1개월 3일 -5시 후의 날짜 정보
        LocalDateTime target = LocalDateTime.now().plusYears(2).plusMonths(1).plusDays(3).minusHours(5);
        //-> 자기가 자기 자신의 객체를 리턴해서 연계 호출이 가능. = "Builder 패턴"
        System.out.println("target = " + target);

        //시간 비교
        //이벤트 시작, 종료일
        LocalDateTime start = LocalDateTime.of(2021, 10, 1, 0, 0);

        LocalDateTime end = LocalDateTime.of(2021, 10, 31, 23, 59, 59);

        //이벤트가 지금 종료됐는지 진행중인지 확인
        if(LocalDateTime.now().isBefore(end)) { // 현재날짜가 end 이전인가 -> true면 이벤트 진행중.
            System.out.println("진행중인 이벤트입니다.");
        } else {
            System.out.println("종료된 이벤트입니다.");
        }

        //사이 날짜 구하기
        long between = ChronoUnit.DAYS.between(start, end);
        System.out.println("between = " + between); // 연체일 구할때 사용하면 좋음.

        System.out.println("---------------------------------------------------------------------");

        //날짜와 시간 포맷팅
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("nowTime = " + nowTime);
        //-> nowTime = 2021-10-25T14:10:13.501 바꾸고 싶음.

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
        //ctrl 누르고 들어가서 267행부터 참고.
        String day = nowTime.format(f);
        System.out.println("day = " + day);
    }
}
