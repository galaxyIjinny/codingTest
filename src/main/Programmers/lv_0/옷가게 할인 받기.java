class Solution {
    public int solution(int price) {
        return price >= 500000 ? price * 8 / 10
                : price >= 300000 ? price * 9 / 10
                : price >= 100000 ? price * 95 / 100
                : price;
    }
}

//

class Solution {
    public int solution(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}