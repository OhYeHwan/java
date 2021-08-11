package ch12;

import java.util.ArrayList;
//Generics
class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

class Ex12_1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
        Box<Grape> grapeBox = new Box<Grape>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
//        fruitBox.add(new Toy());

        appleBox.add(new Apple());
//        appleBox.add(new Toy());
//        appleBox.add(new Grape());

        toyBox.add(new Toy());
//        toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}