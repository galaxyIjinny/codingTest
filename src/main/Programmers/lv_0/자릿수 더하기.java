class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}