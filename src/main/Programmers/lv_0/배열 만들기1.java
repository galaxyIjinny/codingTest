class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < n / k; i++) {
            answer[i] = (i + 1) * k;
        }

        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }
}