package ch11.exercise;

import java.util.ArrayList;

public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        ArrayList kyo = new ArrayList(); //교집합
        ArrayList cha = new ArrayList(); //차집합
        ArrayList hap = new ArrayList(); //합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        hap.addAll(list1);
        hap.removeAll(kyo);
        hap.addAll(list2);

        cha.addAll(list1);
        cha.removeAll(list2);

//        **** My Solution ****
//        kyo = (ArrayList) list1.clone();
//        kyo.retainAll(list2);
//
//        cha = (ArrayList) list1.clone();
//        for(int i=cha.size()-1; i>=0; i--) {
//            if(list2.contains(cha.get(i))) cha.remove(i);
//        }
//
//        hap = (ArrayList) list1.clone();
//        for (Object o : list2) {
//            if (!hap.contains(o)) hap.add(o);
//        }


        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("kyo=" + kyo);
        System.out.println("cha=" + cha);
        System.out.println("hap=" + hap);
    }
}
