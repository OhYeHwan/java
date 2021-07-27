package ch6;

public class Ex6_2 {
    public static void main(String[] args) {
        // ch6-8 객체 배열
        // 객체 배열 === 참조 변수 배열
        // 객체를 만들어준 것이 아니다. 혼동 X
        Variables[] vArr = new Variables[3]; // 길이가 3인 Tv 참조변수 배열 생성
        vArr[0] = new Variables(); // 객체를 만든 뒤에 할당해준다.
        vArr[1] = new Variables();
        vArr[2] = new Variables();

        // 참조변수배열 생성과 객체 생성을 동시에 하기
        //Variables[] vArr = { new Variables(), new Variables(), new Variables()};

    }
}

// ch6-10 클래스의 정의
// 1. 설계도
// 2. 데이터 + 메서드
// 3. 사용자 정의 타입 - 원하는 타입을 직접 만들 수 있다.
class Time {
    int hour;
    int minute;
    int second;

    void print() {
        System.out.println("현재 시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
    }
}

// ch6-11 선언위치에 따른 변수의 종류
class Variables {

    // 1. class 영역
    // instance variable
    // 인스턴스가 생성되었을때 생성된다.
    int iv;

    // class variable
    // 클래스가 메모리에 올라갈 때 생성된다.
    static int cv;



    // 2. method 영역
    void method() {
        // local variable
        // 메서드가 수행 되었을 때 생성된다.
        int lv = 0;
    }

}