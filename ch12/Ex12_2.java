package ch12;

import java.util.ArrayList;


interface Eatable {
}

class Fruit1 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple1 extends Fruit1 {
    public String toString() {
        return "Apple";
    }
}

class Grape1 extends Fruit1 {
    public String toString() {
        return "Grape";
    }
}

class Toy1 {
    public String toString() {
        return "Toy";
    }
}

class Ex12_2 {
    public static void main(String[] args) {
        FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();
        FruitBox<Apple1> appleBox = new FruitBox<Apple1>();
        FruitBox<Grape1> grapeBox = new FruitBox<Grape1>();

//        FruitBox<Toy> toyBox = new FruitBox<Toy>();


        fruitBox.add(new Fruit1());
        fruitBox.add(new Apple1());
        fruitBox.add(new Grape1());
        appleBox.add(new Apple1());
//        appleBox.add(new Grape1());
        grapeBox.add(new Grape1());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleBox);
        System.out.println("grapeBox-"+grapeBox);
    }
}

class FruitBox<T extends Fruit1 & Eatable> extends Box<T> {}
