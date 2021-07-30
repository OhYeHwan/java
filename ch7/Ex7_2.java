package ch7;
// 클래스의 관계는 1.상속 과 2.포함으로 나뉜다.
// ch7-3 포함관계
// 포함(composite)이란
// 클래스의 멤버로 참조변수를 선언하는 것
class Circle {
    int x;
    int y;
    int r;
}

class Point {
    int x;
    int y;
}

class CircleWithComposite {
    Point c = new Point();
    int r;
}

// ch7-4 클래스 간의 관계 결정하기
// 상속관계 : ~ 는 ~ 이다 (is-a)
// 포함관계 : ~ 는 ~ 을 가지고 있다 (has-a)

public class Ex7_2 {
    public static void main(String[] args) {
        Circle cc = new Circle();
        cc.x = 1;
        cc.y = 1;
        cc.r = 2;

        CircleWithComposite c = new CircleWithComposite();
        c.c.x = 1;
        c.c.y = 1;
        c.r = 2;
    }
}
