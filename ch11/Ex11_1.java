package ch11;

import java.util.ArrayList;
import java.util.Collections;


// ch11-7 ~ 11 ArrayList
public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(capacity)가 10인 ArrayList 를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList 에는 객체만 저장가능
        // autoboxing 기능에 의해 기본형이 참조형으로 자동 변환
        list1.add(6);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(1));


        // Collection : 인터페이스
        // Collections : 유틸 클래스
        Collections.sort(list1);

        // ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.containsAll(list2)); // list1 이 list2 를 모두 포함하는?

        list2.add(1, "A"); // 지정한 인덱스에 추가 부담이 많이가는 작업
        System.out.println(list2);

        list2.set(3, "AA"); // 해당인덱스 교체
        System.out.println(list2);
        System.out.println(list2.indexOf("AA")); // 지정된 객체의 위치를 알려준다.

        list1.remove(1); // 해당 위치의 객체 삭제!
        list1.remove(new Integer(1)); // int형 1을 삭제!

        System.out.println();
        System.out.println("Before");
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();
        System.out.println("겹치는부분 제외하고 제거하기");
        // 겹치는 부분 제외하고 제거하기
        // list1 에서 list2 와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        System.out.println(list1);
        System.out.println(list2);


        System.out.println();
        System.out.println("겹치는부분 제거하기");
        // 겹치는 부분을 제거하기
        // list2 에서 list1 에 포함된 객체들을 삭제한다.
        for(int i=list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i))) list2.remove(i);
        }
        System.out.println(list1);
        System.out.println(list2);

    }
}
