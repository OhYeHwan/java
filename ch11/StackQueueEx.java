package ch11;

import java.util.*;

public class StackQueueEx {

    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue = 인터페이스 - LinkedList = 구현체

        st.push("0");
        st.push("1");
        st.push("2");
        st.push("3");

        q.offer("1");
        q.offer("2");
        q.offer("3");

        System.out.println(" === Stack === ");
        while(!st.empty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
        System.out.println(" === Queue === ");
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
    }

}
