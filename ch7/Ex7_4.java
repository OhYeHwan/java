package ch7;

// ch7-7 ~ 9 오버라이딩
// 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

// 오버라이딩의 조건 ***
// 1. 선언부가 조상 클래스의 메서드와 일치해야한다.
// 2. 접근제어자를 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.
// 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
class MyPoint {
    int x;
    int y;
    String getLocation() {
        return "x: " + x +  ", y: " + y;
    }
}

class MyPoint3D extends  MyPoint {
    int z;
    // 조상의 getLocation()을 오버라이딩
    String getLocation() {
        return "x: " + x +  ", y: " + y + ", z: " + z;
    }
}

class obj { // extends Object
    int x;
    int y;

    obj () {}

    obj (int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Object 클래스의 toString() 오버라이딩
    public String toString() {
        return "x: " + x +  ", y: " + y;
    }
}



public class Ex7_4 {
    public static void main(String[] args) {
//        MyPoint3D p = new MyPoint3D();
//        p.x = 3;
//        p.y = 5;
//        p.z = 8;
//        System.out.println(p.getLocation());

        // toString 오버라이딩 테스트
        // 원래 toString()은 주소값을 리턴
        obj o = new obj(3, 5);
        System.out.println(o);
        System.out.println(o.toString());

    }
}

// 오버로딩 vs 오버라이딩
// 오버로딩 : 기존에 없는 새로운 메서드를 정의하는 것 (new)
// 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것 (change, modify)