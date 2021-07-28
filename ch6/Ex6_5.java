package ch6;


//ch6-30 오버로딩 (overloading) : 한 클래스 안에 같은 이름의 메서드를 여러개 정의하는 것
public class Ex6_5 {
    // 오버로딩이 성립하기 위한 조건
    // 1. 메서드 이름이 같아야 한다.
    // 2. 매개변수의 개수 또는 타입이 달라야 한다.
    // 3. 반환 타입은 영향없다.
    public static void main(String[] args) {
        MyMath2 m2 = new MyMath2();
        System.out.println("m2.add(3,3) 결과 : " + m2.add(3,3)); // println 보다 안쪽에 있는 m2.add 함수가 먼저 실행
        // 클래스에 정의된 메서드의 매개변수 타입과 일치하지 않게 메서드를 호출하게 되면
        // ex) 정의된 메서드 타입 (long, int) , (int, long)
        // ex) 호출 시 입력한 타입 (int, int) 인 경우
        // ambiguous 경고문이 발생하고
        // 오버로딩된 메서드들 중에서 가장 위에있는 메서드를 실행한다.
    }
}

class MyMath2 {
    // 오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의 기능수행!
    int add(int a, int b) { //
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add (long a, long b) {
        return a + b;
    }

    int add (int[] a) {
        int result = 0;
        for(int i=0; i< a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
