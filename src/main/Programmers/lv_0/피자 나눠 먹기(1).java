class Solution {
    public int solution(int n) {
        int answer = (n % 7 == 0) ? n / 7 : n / 7 + 1;

        return answer;
    }
}

// 아이디어의 중요성

class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}