class Solution {
    public int solution(int num1, int num2) {
        boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
        int answer = -1;
        if(val){
            answer = num1 + num2;
        }
        return answer;
    }
}

class Solution {
    static int Add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    public int solution(int num1, int num2) {
        return Add(num1, num2);
    }
}

//

class Solution {
    public int Sub(int x, int y) {
        return y == 0 ? x : hiki(x ^ y, (~x & y) << 1);
    }

    public int solution(int num1, int num2) {
        return Sub(num1, num2);
    }
}

//

class Solution {
    static int Mul(int a, int b) {
        int res = 0;
        while (b > 0) {
            if ((b & 1) != 0) res = res + a;
            a = a << 1;
            b = b >> 1;
        }
        return res;
    }

    public int solution(int num1, int num2) {
        return Mul(num1, num2);
    }
}
