package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for(int i=0; i<10; i++) {
            list.add(i + "");
        }

        ListIterator it = list.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        while(it.hasPrevious()) {
            System.out.print(it.previous());
        }
        System.out.println();
    }
}
