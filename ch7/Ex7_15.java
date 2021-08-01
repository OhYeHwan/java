package ch7;

// ch7-38 인터페이스와 다형성


// 인터페이스도 구현 클래스의 부모라고 볼 수 있다.
// 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능
// 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

/*
interface Fightable {
    void move(int x, int y);
    void attack(Fightable f); 인터페이스 타입 매개 변수
}
 */

/*
class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Fightable f) {}
}

public class Ex7_15 {
    public static void main(String[] args) {
        조상 클래스 -> 자손 객체
        Unit u = new Fighter(); // OK
        인터페이스 -> 자손 객체
        Fightable f = new Fighter(); // OK
    }
}
*/

public class Ex7_15 {
}
