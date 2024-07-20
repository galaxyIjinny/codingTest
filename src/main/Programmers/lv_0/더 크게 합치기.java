class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String A = String.valueOf(a) + String.valueOf(b);
        String B = Integer.toString(b) + Integer.toString(a);

        if (Integer.parseInt(A) >= Integer.parseInt(B)) {
            answer = Integer.parseInt(A);
        } else {
            answer = Integer.parseInt(B);
        }

        return answer;
    }
}