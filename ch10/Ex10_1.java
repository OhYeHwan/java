package ch10;

import java.util.Calendar;

// ch10-1 ~ 3 날짜와 시간, Calendar 클래스
public class Ex10_1 {
    public static void main(String[] args) {
        // 기본적으로 현재 날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance(); // Calendar 객체 생성 -> new X

        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE 와 DAY_OF_MONTH 는 같다
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK)); // 1:일요일, 2:월요일 ... 7:토요일
        System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));

        System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59) : " + today.get(Calendar.SECOND));

        // 천분의 1초를 시간으로 표시하기 위해 3600000 으로 나누었다. (1시간 = 60 * 60초)
        System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(-12~+12) : " + today.get(Calendar.ZONE_OFFSET));
        System.out.println("이 달의 마지막 날 : " + today.get(Calendar.DATE)); // 이달의 마지막일을 찾는다

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DATE);


        System.out.println(year + "년 " + month + "월 " + day + "일 ");
        System.out.println(today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분 " + today.get(Calendar.SECOND) + "초 ");
    }
}