package ch7;


// ch7-39 인터페이스의 장점
// 개발 시간을 단축할 수 있다.
// 변경에 유리한 유연한 설계가 가능하다.
// 표준화가 가능하다.
// 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.

class A {
    public void method(I i) { // 인터페이스 I를 구현한 객체만 들어올 수 있다.
        i.method();
    }
}

// B,C 클래스의 선언과 구현을 분리
interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I{
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class Ex7_16 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용 (의존)
        a.method(new C()); // A가 C를 사용 (의존)
    }
}


// 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.
class GroundUnit {}
class AirUnit {}

interface Repairable {}

class SCV extends GroundUnit implements Repairable {}
class Tank2 extends  GroundUnit implements  Repairable {}
class DropShip2 extends  AirUnit implements  Repairable {}