package ch7;

class Buyer2 {
    int money;
    int bonus;
    int count;
    Product[] cart = new Product[10];

    Buyer2() { // 기본 생성자
        this(1000);  // 아무것도 입력되지않았을 때 다른 생성자에 1000 입력
    }

    Buyer2(int money) {
        this.money = money;
        this.bonus = money/10;
        this.count = 0;
    }

    void buy(Product p) {
        if(p.price > this.money) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        cart[count++] = p;
        this.money -= p.price;
        this.bonus += p.bonus;
        System.out.println(p.toString() + " 를/을 구매 하였습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i=0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i].toString() + ", ";
        }
        System.out.println("구입하신 물품 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}


public class Ex7_11 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Keyboard());
        b.buy(new Mouse());
        b.summary();
    }
}
