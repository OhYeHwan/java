package ch7;

abstract class Player { // 추상 클래스
    abstract void play(int pos); // 추상 메서드
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) { // 추상메서드 구현
        System.out.println(pos + "부터 재생 합니다.");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}


public class Ex7_12 {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer(); // 타입일치
        ap.play(100);
        ap.stop();

        Player p = new AudioPlayer(); // 다형성
        p.play(300);
        p.stop();
    }
}
