class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i <= num_list.length / 2; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
            answer[num_list.length - 1 - i] = num_list[i];
        }

        return answer;
    }
}

//

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

import java.util.stream.LongStream;

class Solution {
    public int[] solution(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .ampToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }