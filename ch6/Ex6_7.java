package ch6;

//ch6-36 ~ 37 생성자 this() , 참조변수 this
public class Ex6_7 {
    public static void main(String[] args) {

        Car2 c1 = new Car2 ();
        Car2 c2 = new Car2("red");
        Car2 c3 = new Car2("blue", "auto", 2);

        System.out.println("c1");
        c1.printCar();
        System.out.println("c2");
        c2.printCar();
        System.out.println("c3");
        c3.printCar();
    }
}


class Car2 {
    String color;
    String gearType;
    int door;

    // 생성자 this()
    // - 생성자에서 다른 생성자 호출 할 때 사용
    // - 다른 생성자에서 호출시 첫 줄에서만 사용 가능 **
    // 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    // 참조변수 this
    // - 인스턴스 자신을 가리키는 참조변수
    // - 인스턴스 메서드(생성자 포함) 에서 사용가능
    // - 지역변수와 인스턴스 변수를 구별할 때 사용
    // 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
    // 모든 인스턴스 메서드에 지역변수를 숨겨진채로 존재한다.
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    void printCar() {
        System.out.println("color : " + this.color);
        System.out.println("gearTypes : " + this.gearType);
        System.out.println("door : " + this.door);
    }

}



