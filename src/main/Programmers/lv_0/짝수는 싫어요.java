class Solution {
    public int[] solution(int n) {
        int[] answer = n % 2 == 0 ? new int[n / 2] : new int[n / 2 + 1];

        for (int i = 1; i <= n; i += 2) {
            answer[(i - 1) / 2] = i;
        }

        return answer;
    }
}

//

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}