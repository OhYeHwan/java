package ch6;

public class Ex6_1 {
    public static void main(String[] args) {
        // 참조변수 선언
        Tv LGtv;

        // Tv객체 생성 후 객체의 주소를 참조변수에 저장
        LGtv = new Tv("red", 7, false);

        System.out.print(LGtv + " "); // 객체의 주소 값
        System.out.print(LGtv.color + " "); // 인스턴스의 색상
        System.out.print(LGtv.channel + " "); // 인스턴스의 채널
        System.out.println(LGtv.power); // 인스턴스의 파워

        // 인스턴스의 메서드 실행
        LGtv.power();  // 켜기
        LGtv.channelUp(); // 채널 올리기

        System.out.print(LGtv.power + " ");
        System.out.println(LGtv.channel);

    }
}

class Tv {
    // 생성자 설정
    Tv(String color, int channel, boolean power) {
        this.color = color;
        this.channel = channel;
        this.power = power;
    }

    // 클래스 멤버변수
    String color;
    int channel;
    boolean power;

    // 클래스 메서드
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}