package ch11;

import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1),"7", "2", "2", "3", "10", "11", "0"};
        Set set = new HashSet();

        for(int i=0; i<objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }
}
