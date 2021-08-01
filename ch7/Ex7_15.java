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

abstract class Unit2 {
    int x,y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable2 { // 인터페이스의 모든 메서드는 public abstract 가 생략
    void move(int x, int y); // public abstract가 생략됨
    void attack(Fightable2 f);  // public abstract가 생략됨
}

class Fighter3 extends Unit2 implements Fightable2 {
    // 오버라이딩 규칙 : 조상(public) 보다 접근제어자의 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "] 로 이동");
    }
    public void attack(Fightable2 f) {
        System.out.println(f+"를 공격");
    }

    Fightable2 getFightable() {
        Fightable2 f = new Fighter3();
        return f;
    }
}

public class Ex7_15 {
    public static void main(String[] args) {
        Unit2 f = new Fighter3();
        f.move(100, 200);
        Fighter3 f2 = new Fighter3();
       // f.attack(f2);  Unit2 에는 attack() 가 없어서 호출 불가

        Fightable2 f3 = new Fighter3();
       // f3.stop();  Fightable2 에는 stop() 가 없어서 호출 불가

        Fighter3 ff = new Fighter3();
        Fightable2 ff2 = ff.getFightable();

    }
}
