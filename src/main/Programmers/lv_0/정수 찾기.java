class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int num : num_list) {
            if (n == num)
                answer = 1;
        }

        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList, int n) {
        return IntStream.of(numList)
                .anyMatch(num -> num == n) ? 1 : 0;
    }
}