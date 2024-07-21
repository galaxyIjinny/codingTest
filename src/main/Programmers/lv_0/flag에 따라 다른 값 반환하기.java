class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? (a + b) : (a - b);
    }
}

// 범위 신경쓴 풀이

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (a < -1000) throw new IllegalArgumentException("Out of range");
        if (b > 1000) throw new IllegalArgumentException("Out of range");
        if (!flag) b *= -1;
        answer = (a) + (b);
        return answer;
    }
}