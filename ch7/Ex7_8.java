package ch7;

// ch7-22 캡슐화와 접근 제어자
// 접근 제어자를 사용하는 이유 : 외부로부터 데이터를 보호하기 위해서
// 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

class Time {
    private int hour; // hour : 0 ~ 23 사이의 값을 가져야함
    private int minute;
    private int second;
    
    public void setHour(int hour) {
        if(isNotValidHour(hour)) return;
        this.hour = hour;
    }

    // 함수 추출
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() { return hour; }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(2);
        System.out.println(t.getHour());

    }
}
