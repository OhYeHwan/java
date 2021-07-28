package ch6;

// c6-26 static 메서드와 인스턴스 메서드
public class Ex6_4 {
    // 인스턴스 메서드
    // - 인스턴스 생성 후, '참조변수.메서드이름()' 으로 호출
    // - 인스턴스 멤버와 관련된 작업을 하는 메서드
    // - 메서드 내에서 인스턴스 변수 사용가능

    // static 메서드 (클래스 메서드)
    // - 객체 생성없이 '클래스이름.메서드이름()'으로 호출
    // - 인스턴스 멤버와 관련없는 작업을 하는 메서드
    // - 메서드 내에서 인스턴스 변수 사용 불가


    // 객체란  iv의 묶음이라고 볼 수 있다.
    // 인스턴스 변수는 개별 속성
    // 클래스 변수는 공통 속성을 가진다.

    // 그럼 static은 언제 붙여야 할까?
    // -> 인스턴스멤버(iv, im)를 사용하지 않는 메서드에 static을 붙인다.

    public static void main(String[] args) {
        System.out.println(MyMath.add(200L, 100L)); // 클래스 메서드 호출
        // ----------------------------------------------------------------
        MyMath m = new MyMath();
        m.a = 200L;
        m.b = 100L;
        System.out.println(m.add());
    }

}


// 인스턴스 메서드 vs 클래스 메서드
class MyMath {
    long a, b;
    long add () { // 인스턴스 메서드
        return a+b; // iv 인스턴스 변수 사용
    }

    static long add(long a, long b) { // / static / 클래스 메서드
        return a + b; // lv 지역변수 사용
    }
}

// 메서드 간의 호출과 참조
// static 메서드는 인스턴스 변수를 사용할 수 없다.
class TestClass {
    int iv;
    static int cv;

    void instanceMethod() { // 인스턴스 메서드
        System.out.println(iv); // 인스턴스변수를 사용ㅎㄹ 수있다.
        System.out.println(cv); // 클래스변수를 사용할 수있다.
    }

    static void  staticMethod() { // 클래스 메서드
        // System.out.println(iv); // 인스턴스 변수를 사용할 수 없다.
        System.out.println(cv); // 클래스 변수는 사용할 수 있다.
    }


    // 메서드 간의 호출과 참조
    // static 메서드는 인스턴스 메서드를 호출할 수 없다.
    void instanceMethod2() { // 인스턴스 메서드
        instanceMethod(); // 다른 인스턴스 메서드 호출한다.
        staticMethod(); // static 메서드를 호출한다.
    }

    static void staticMethod2() { // static 메서드
        //instanceMethod();  // 인스턴스 메서드를 호출할 수 없다.
        staticMethod(); // static 메서드는 호출 할 수 있다.
    }

}