class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000; // 최댓값이 음수일 경우의 반례를 위해서
        // int answer = Integer.Min_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }

        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len -2] * numbers[len -1 ]);
    }