package ch6;

// ch6-32 생성자(constructor)
// 인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메서드
public class Ex6_6 {
    public static void main(String[] args) {
        Car c = new Car("white", "auto", 4);
        // 참조변수 c 생성 = 객체 생성 + 생성자 호출
    }
}

class Card {
    // 이름이 클래스 이름과 같아야한다.
    // 리턴값이 없다.
    // 모든 클래스는 반드시 생성자를 가져야 한다.
    Card(){ // 기본생성자 , 매개변수 없는 생성자
        // 생성자가 하나도 없을 때만, 컴파일러가 자동 추가
        // 인스턴스 초기화 작업
    }

    Card(String kind, int number) { // ㅁ개변수 있는 생성자
        // 인스턴스 초기화작업
    }
}


class Car {
    String color;
    String gearType;
    int door;

    Car() {}
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}