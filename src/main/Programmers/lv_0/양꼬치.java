class Solution {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - ((n / 10) * 2000);
    }
}

// 객체지향형 풀이

class Solution {
    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
        return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        int poin = lambQuantity / 10;

        return menu.getPRice() * point;
    }
}

enum Menu {
    LAMB("양꼬치", 12000);
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}