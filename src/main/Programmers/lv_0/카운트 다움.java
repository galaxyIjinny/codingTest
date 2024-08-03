class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for (int i = 0; i <= start_num - end_num; i++) {
            answer[i] = start_num - i;
        }

        return answer;
    }
}

//

import java.util.stream.IntStream;
        import java.util.stream.*;
        import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> i).toArray();
        // return IntStream.rangeClosed(end, start).boxed()
        // .collect(Collectors.toList()).stream()
        // .sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        // return IntStream.rangeClosed(end, start).boxed()
        // .sorted(Comparator.reverseOrder())
        // .toArray(Integer[]::new);
    }
}