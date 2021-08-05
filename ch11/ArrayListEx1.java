package ch11;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); // 초기용량이 10인 ArrayList 생성

        // add 메서드 사용
        for(int i=5; i>=0; i--) {
            list1.add(i);
        }

        // 주어진 컬렉션이 저장된 ArrayList를 생성
        // subList : fromIndex 부터 toIndex 사이에 저장된 객체를 반환한다.
        ArrayList list2 = new ArrayList(list1.subList(0,2));
        print(list1, list2);


        System.out.println("Collections Sort 메서드 사용 : ");
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);


        // containsAll : list2가 list1에 전부 포함되어 있는지 확인한다.
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));


        System.out.println("문자열 추가");
        list2.add("B");
        list2.add("C");
        list2.add('A');
        print(list1, list2);

        System.out.println("데이터 중간에 추가하기");
        list2.set(3, "AA");
        print(list1, list2);

        // retainAll : list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. 교집합
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);



        // list2 에서 list1에 포함된 객체들을 삭제한다.
        // 뒤에서 부터 삭제를 해야함 --> 복사 문제
        System.out.println("list2에서 list1에 포함된 객체 삭제");
        for(int i= list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i))) list2.remove(i);
        }
        print(list1, list2);


    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
