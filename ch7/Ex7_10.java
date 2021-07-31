package ch7;

// ch7 -27 ~ 28 매개변수 다형성

class Product {
    int price = 0;
    int bonus = 0;

    Product() {
        this(0);
    }
    
    Product(int price){
        this.price = price;
        this.bonus = price/10;
    }
}

class Mouse extends Product {
    Mouse() { super(100); }
    public String toString() { // Object 클래스의 toString 오버라이딩
        return "마우스";
    }
}

class Keyboard extends Product {
    Keyboard() { super(200); }
    public String toString() {
        return "키보드";
    }
}

class Buyer {
    int money = 1000;
    int bonus = 0;

    void buy(Product p) {
        if(p.price > money) {
            System.out.println("돈이 모자랍니다.");
            return;
        }
        this.money -= p.price;
        this.bonus += p.bonus;
        System.out.println(p + " 를/을 구매하였습니다");
    }
}


public class Ex7_10 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Mouse());
        System.out.println("금액 : " + buyer.money + "적립금 : " + buyer.bonus);
        buyer.buy(new Keyboard());
        System.out.println("금액 : " + buyer.money + "적립금 : " + buyer.bonus);
    }
}
