package ch7;

// ch7-5 단일 상속 (Single Inheritance)
// 자바는 단일 상속만을 허용한다.
// 비중이 높은 클래스 하나만 상속관계로 , 나머지는 포함관계로 한다.
// Inheritance + Composite


// ch7-6 Object 클래스 - 모든 클래스의 조상
// 부모가 없는 클래스는 자동적으로 Object 클래스를 상속받게된다.
// 모든 클래스는 Object 클래스에 정의된 11 개의 메서드를 상속받는다. toString(), equals(Object obj) hashCode(), ...
class dvd extends Object {
    int x;
    int y;
}

public class Ex7_3 {
    public static void main(String[] args) {
        dvd d = new dvd();
        System.out.println(d.toString()); // toString() - 문자열 반환
        System.out.println(d); // 결과가 toString()과 같다
    }
}
