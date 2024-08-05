class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        // int answer = (num_list < 11 ? 1: 0);

        if (num_list.length > 10) {
            for (int i : num_list) answer += i;
            answer -= 1;
        } else {
            for (int i : num_list) answer *= i;
        }

        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
    }
}