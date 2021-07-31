package ch7;

abstract class Unit {
    int x;
    int y;
    void stop() {
        System.out.println("해당 자리에서 멈춘다");
    };
    abstract void move(int x, int y) ;
}

class Marine extends Unit{
    void move(int x, int y) {
        System.out.println("Marine : x = " + x + " y = " + y);
    }
    void stimpack() { }
}

class Tank extends Unit{
    void move(int x, int y) {
        System.out.println("Tank : x = " + x + " y = " + y);
    }
    void changeMode() {}
}

class DropShip extends Unit {
    void move(int x, int y) {
        System.out.println("DropShip : x = " + x + " y = " + y);
    }
    void load() {}
    void unload() {}
}

public class Ex7_13 {
    public static void main(String[] args) {
        // 아래는 Object 객체에는 Move 메서드가 없기 때문에 저장은 가능하지만
        // 호출이 불가능!
        // Object[] group = {  new Marine(), new DropShip(), new Tank() };
        // group[0].move
        
        // Unit 추상 클래스에 move 메서드가 추상화 되어있기때문에
        // 배열에 넣어서 메서드 호출 가능!
        Unit[] group = { new Marine(), new DropShip(), new Tank() };
        group[0].move(10, 10);
        group[1].move(100 , 100);
        group[2].move(300, 300);

        group[0].stop();
        group[1].stop();
        group[2].stop();
    }
}
