package ch6;

class Data { int x; }

class primitive {
    // ch6-22 호출 스택(call stack)
    // 호출스택이란 메서드 수행에 필요한 메모리가 제공되는공간이며
    // 메서드가 호출되면 호출스택에 메모리가 할당되고 종료되면 해제된다.
    // 맨위에 있는 메서드 하나만 실행되며 나머지는 대기상태이다.

    // ch6-23 기본형 매개변수
    // 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다. (read only)
    // 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read & write)
    public static void main(String[] args) {
        Data d = new Data();  // 메인 스택안에서 참조변수 d를 생성하고 객체의 주소값을 저장
        d.x = 10;
        System.out.println("main() : x = "  + d.x);
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    // 기본형 매개변수
    static void change(int x) { // 함수가 호출이 되면 change 스택안에서 x 변수 생성하고 값을 대입
        x = 1000; // change 스택안의 변수 x에서 값을 변경
        System.out.println("change() : x = " + x);
    }
}

// 참조형 매개변수
class reference_1 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d); // 2. 이때 입력되는 d의 값은 객체 Data의 주소값이다.
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data d) { // 1.함수가 호출되면 change 스택안에서 참조형변수 d를 생성하고 입력된 값을 대입한다.
        d.x = 1000; // 3. change 스택안의 d에 저장된 주소값도 main 스택의 d의 저장된 주소값과 같기 때문에 동일한 객체의 값이 변경된다.
        System.out.println("change() : x = " + d.x);
    }
}

// 참조형 반환타입
class reference_2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
