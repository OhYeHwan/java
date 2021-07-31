package ch7;

interface Fightable {
    void move(int x, int y);
    void attack(Unit u);
    // public abstract 가 생략되어 있음
}

// 인터페이스 사용시 implements 사용
class Fighter implements Fightable {
    // 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
    public void move(int x, int y) { /* 구현 생략 */ }
    public void attack(Unit u) { /* 구현 생략 */ }
}

abstract class Fighter2 implements Fightable {
    // 일부만 구현하는 경우 클래스 앞에 abstract 를 붙여야 함.
    public abstract void move(int x, int y);
//    public abstract void attack(Unit u);

}


public class Ex7_14 {
    // 인터페이스란
    // 추상 메서드의 집합

    // 인터페이스의 구현이란?
    // 인터페이스의 추상메서드 몸통{} 맏륵기 - 미완성 설계도 완성하기

    // 추상 클래스와 인터페이스의 공통점
    // 추상 메서드를 가지고 있다.

    // 추상 클래스와 인터페이스의 차이점
    // 인터페이스는 iv를 가질 수 없다
}
