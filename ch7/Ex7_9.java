package ch7;

// ch7-23 다형성(polymorphism)
// 여러가지 형태를 가질 수 있는 능력
// ** 조상 타입 참조 변수로 자손 타입 객체를 다루는 것

// 대부분 참조변수 타입과 인스턴스의 타입이 일치함
// Tv t = new Tv();
// SmartTv s = new SmartTv();

// 하지만 다형성은 타입이 불일치
// Tv t = new SmartTv();
// 이 상황이 조상 타입 참조변수로 자손 타입의 객체를 다루는 형태
// 참조변수 멤버가 인스턴스 멤버보다 작은 건 가능
// 하지만 참조변수 멤버가 인스턴스 멤버보다 크면 X
// 존재하지 않는 인스턴스 멤버를 호출하게 되면 에러가 발생하기 떄문


// ch7-24 ~ 25 참조변수의 형변환
// 기본형의 형변환의 경우 값 자체가 변하지만
// 참조변수의 형변환의 경우
// 사용할 수 있는 멤버의 개수를 조절하는 것을 뜻한다.
// 조상 자손 관계의 참조변수는 서로형변환이 가능하다.
// 하지만 여기서 중요한 점은
// *참조변수들이 가리키는 실제 인스턴스가 무엇인지 확인하고
// 그멤버의 개수를 넘어서는 안된다는 것이다.

// 큰 것에서 작은 것 으로 : 안전한 변환 -> 생략 가능
// 조상 -> 자손 으로 형변환 : 불안전한(생략 불가능)
// 자손 -> 조상 으로 형변환 : 안전한 변환(생략가능)

public class Ex7_9 {
    public static void main(String[] args) {
        Car c = new Car(); // 멤버 4개
        FireEngine f = null; // 참조변수 선언
        f = (FireEngine)c; // ClassCastException 에러 발생
        // 형변환은 가능하지만
        // 실제 인스턴스의 멤버가 4개이기 때문에 ClassCastException 에러가 발생한다.
        // 즉 참조변수들이 가리키는 실제인스턴스가 무엇인지 확인하는 것이 중요
        f.water();

//        FireEngine fire = new FireEngine();  멤버 5개
//        Car ca = null;  참조변수 선언
//        ca = (Car)fire;  형변환

    }
}


class Car {
    int door;
    String color;

    void drive() {
        System.out.println("부릉부릉");
    }

    void stop() {
        System.out.println("멈춰~");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("물대포 슈슈슉!");
    }
}
