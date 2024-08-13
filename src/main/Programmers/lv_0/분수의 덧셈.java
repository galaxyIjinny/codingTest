class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int g = gcd(num, denom);
        //
        /*for (int i = denom; i >= 1; i--) {
            if (num % i == 0 && denom % 1 == 0) {
                num /= i;
                denom /= i;
            }
        }*/

        int[] answer = new int[2];
        answer[0] = num / g;
        answer[1] = denom / g;

        return answer;
    }

    public int gcd(int A, int B) { // 메소드명 카멜케이스
        if (B == 0) return A;
        return gcd(B, A % B);
    }
}
