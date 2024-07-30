class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int a : array) {
            answer += height < a ? 1 : 0;
        }

        return answer;
    }
}

// 스트림

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}