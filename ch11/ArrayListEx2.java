package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; // 자르고자 하는 글자의 개수를 지정
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();
        System.out.println("length : " + length);

        List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 지정

        // LIMIT 만큼 증가
        for(int i=0; i < length; i+=LIMIT) {
            // 시작점부터 지정한만큼 잘라서 저장
            if(i+LIMIT < length) list.add(source.substring(i, i+LIMIT));
            else list.add(source.substring(i));
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

