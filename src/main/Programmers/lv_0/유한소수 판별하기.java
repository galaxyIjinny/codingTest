class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int remain = gcd(a, b);
        int denom = b / remain;

        while (denom > 1) {
            if (denom % 2 == 0) {
                denom /= 2;
            } else if (denom % 5 == 0) {
                denom /= 5;
            } else {
                return 2;
            }
        }

        return answer;

        //
        /*while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        if ((a / (double) b) % 1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;*/
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}