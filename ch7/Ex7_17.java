package ch7;

// ch7-40 디폴트 메서드와 static 메서드
// 인터페이스에 디폴트 메서드, static 메서드 추가 가능
// 인터페이스에 새로운 메서드(추상 메서드)를 추가하기 어려움
// 인터페이스에 새로운 메서드가 추가되면
// 기존에 인터페이스를 구현했던 클래스들에 새로운 메서드의 몸통을 만들어줘야한다.
// 해결책 => 디폴트 메서드
// 디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반)
// default void newMethod(){} : 몸통이 있는 메서드

// 디폴트 메서드가 기존의 메서드와 충돌할 때의 해결책
// 1. 여러 인터페이스의 디폴트 메서드 간의 충돌
//    - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
// 2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
//    - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
// 규칙을 잘모르겠으면 그냥 직접 오버라이딩 하자!

import java.sql.SQLOutput;

// Ch7-42 내부 클래스(inner class)
// 클래스 안의 클래스
class AA { // BB의 외부 클래스
    class BB { // AA의 내부 클래스
        // 내부클래스의 장점
        // 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
        // 코드의 복잡성을 줄일 수 있다. (캡슐화)
    }
}

// ch7-42 ~ 44 내부클래스의 종류 특징 선언
class AAA {
    int i = 10000;

    class BBB {
        void method() {
            System.out.println(i); // 내부에서 접근 가능
        }
    }
}

// 인스턴스 내부 클래스
// 스태틱 내부 클래스
// 지억 내부 클래스
// 익명 클래스

// ch7-45 내부 클래스의 제어자와 접근성
// - 내부 클래스의 제어자는 변수에 사용 가능한 제어자와 동일
class Outer {
    private int outerIv = 0;
    private static int outerCv = 0;
    // 인스턴스 내부 클래스
    protected class InstanceInner {

        int iiv = outerIv; // **외부 클래스의 private 멤버도 접근 가능
        int iiv2 = outerCv;

        int iv = 100;
        // static int cv = 100; // 에러  static 변수를 선언할 수 없다.
        final static int CONST = 100; // final static은 상수이므로 허용
    }

    // static 내부 클래스
    protected static class StaticInner {

        //int siv = outerIv; // 스태틱 클래스는 외부클래스의 인스턴스 멤버에 접근 불가

        int iv = 200;
        static int cv = 200; // static클래스만 static멤버를 정의할 수 있다.
    }

    void myMethod() {

        final int lv = 0;
        final int Lv = 0;

        // 지역 내부 클래스
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // ***외부클래스의 지역변수는 final이 붙은변수만 접근 가능
            int liv3 = lv;
            int liv4 = Lv;

            int iv = 300;
            // static int cv = 300;
            final static int CONST = 300; // final static은 상수이므로 허용
        }
    }
}


public class Ex7_17 {
    public static void main(String[] args) {
        System.out.println(Outer.StaticInner.cv);
        System.out.println(Outer.InstanceInner.CONST);

        AAA a = new AAA();
        AAA.BBB b = a.new BBB();
        b.method();
    }
}
