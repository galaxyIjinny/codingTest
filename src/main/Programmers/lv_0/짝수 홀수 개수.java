class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i : num_list) {
            if (i % 2 == 0) answer[0]++;
            else answer[1]++;
            // answer[i % 2]++;
        }

        return answer;
    }
}

//

import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(),
                (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
    }
}