package ch11;

import java.util.*;

public class TreeSetLotto {
    public static void main(String[] args) {
        // 이진검색트리 자료구조의 형태로 데이터를 저장하는 클래스
        // 중복 저장 X
        // 저장 순서 유지 X
        Set set = new TreeSet();

        for(int i=0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num); // set.add(new Integer(num)) 오토박싱
        }

        System.out.println(set);
    }
}
