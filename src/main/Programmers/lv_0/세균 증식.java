class Solution {
    public int solution(int n, int t) {
        return n *(int) Math.pow(2, t);
        // return n << t;
        //
        /*int answer = n;
        for (int i = 0; i < t; i++) {
            answer += answer;
        }
        return answer;*/
    }
}