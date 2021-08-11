package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
    String name;
    int weight;

    Fruit4 (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple4 extends Fruit4 {
    Apple4(String name, int weight) {
        super(name, weight);
    }
}

class Grape4 extends  Fruit4 {
    Grape4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple4> {
    public int compare(Apple4 t1, Apple4 t2) {
        return t2.weight - t1.weight;
    }
}

class GrapeComp implements Comparator<Grape4> {
    public int compare(Grape4 t1, Grape4 t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComps implements Comparator<Fruit4> {
    public int compare(Fruit4 t1, Fruit4 t2) {
        return t1.weight - t2.weight;
    }
}

class Box4<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() { return list; }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class FruitBox4<T extends  Fruit4> extends Box4<T> { }

public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox4<Apple4> appleBox = new FruitBox4<>();
        FruitBox4<Grape4> grapeBox = new FruitBox4<>();

        appleBox.add(new Apple4("GreenApple", 3000));
        appleBox.add(new Apple4("GreenApple", 2000));
        appleBox.add(new Apple4("GreenApple", 1000));

        grapeBox.add(new Grape4("GreenGrape", 400));
        grapeBox.add(new Grape4("GreenGrape", 500));
        grapeBox.add(new Grape4("GreenGrape", 1000));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComps());
        Collections.sort(grapeBox.getList(), new FruitComps());

        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}
