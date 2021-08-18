package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student other) {
        return 1;
    }
}

public class ArrayListEx0 {

    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(new Student("오예환", 27, 100));
        arr.add(new Student("박효신",  25,  50));
        arr.add(new Student("김범수", 25,   40));

        Collections.sort(arr);

        for(Student a : arr) {
            System.out.println(a.getName() + " " + a.getAge() + " " + a.getScore());
        }


    }
}
