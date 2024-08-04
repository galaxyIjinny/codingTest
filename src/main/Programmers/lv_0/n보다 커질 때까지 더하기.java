class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i : numbers) {
            if (answer > n) break;
            answer += i;
        }
        //
        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
    }
}