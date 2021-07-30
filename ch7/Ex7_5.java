package ch7;

// ch7-10 ~ 11 참조변수 super, 생성자 super()

// 참조변수 super
// 객체 자신을 가리키는 참조변수. 인스턴스 메서드내에만 존재
// 조상의 멤버를 자신의 멤버와 구별할 때 사용
class PParent { int x = 10; }
class CChild extends PParent {

    int x = 20;

    void method() {
        System.out.println("x = " + x); // 20
        System.out.println("this.x = " + this.x); // 20
        System.out.println("super.x = " + super.x ); // 20
    }
}

// 조상의 생성자 super()
// 조상의 생성자를 호출할 때 사용
// 조상의 멤버는 조상의 생성자를 호출해서 초기화
// 생성자의 첫 줄에 반드시 생성자를 호출해야 한다. ***
// 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입
// 기본생성자 작성 필수!!
//class Point {
//    int x,y;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//
//class Point3D extends Point {
//    int z;
//    Point3D(int x, int y, int z) {
//        super(x,y); // 조상클래스의 생성자 Point(int x, int y)를 호출
//        this.z = z; // 자신의 멤버를 초기화
//    }
//}



public class Ex7_5 {
    public static void main(String[] args) {
        CChild c = new CChild();
        c.method();
    }
}
