class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 이중 반복하면 시간 초과
            if (n % i == 0) answer++;
        }
        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}