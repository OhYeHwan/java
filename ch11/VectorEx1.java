package ch11;

import java.util.Vector;

// 배열을 이용한 자료구조 : ArrayList, Vector
// 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는데 효율이 좋지만
// 용량을 변경해야 할때는 새로운 배열을 생성한 후 기존의 데이터를 복사해야하기 때문에
// 효율이 떨어진다는 단점이 있다.
// 따라서 처음 인스턴스를 생성할 때, 저장할 데이터의 개수를 잘 고려하여 충분한 용량의 인스턴스를 생성하는 것이 좋다.

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5); // 초기 용량이 5인 Vector 생성
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 용량과 현재 크기를 같게한다.
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity() ===");
        print(v);

        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear();
        System.out.println("=== After clear() ===");
        print(v);


    }

    public static void print(Vector v) {
        System.out.println(v); // 벡터에 저장된 값을 배열로 보여준다
        System.out.println("size : " + v.size()); // 벡터의 현재 데이터의 개수를 보여준다.
        System.out.println("capacity : " + v.capacity()); // 초기 용량
        System.out.println();;
    }
}
