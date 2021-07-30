package ch7;

// ch7-1 ~ 2 상속
// 기존의 클래스로 새로운 클래스를 작성하는 것 (코드의 재사용)
// 두 클래스를 부모와 자식으로 관계를 맺어주는 것
// 자손은 조상의 모든 멤버를 상속 받는다. (생성자, 초기화블럭 제외)
// 자손의 멤버개수는 조상보다 같거나 많다.
class Parent {
    int age;
}
class Child extends Parent {
    void play() {
        System.out.println("놀자~");
    }
}


public class Ex7_1 {
    public static void main(String[] args) {
       smartTv stv = new smartTv();
       stv.power();
       stv.channel = 11;
       stv.channelUp();
       System.out.println(stv.channel);
       stv.displayCaption("Hello World");
       stv.caption = true;
       stv.displayCaption("Hello World");
    }
}


class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class smartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
