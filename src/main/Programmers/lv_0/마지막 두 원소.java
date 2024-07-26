import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOf(num_list, len + 1);

        answer[len] = answer[len - 1] > answer[len - 2] ? answer[len - 1] - answer[len - 2] : answer[len - 1] * 2;

        return answer;
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.iterate(0, i -> i + 1)
                .limit(num_list.length + 1)
                .map(i -> i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i])
                .toArray();
    }
}

//
import java.util.*;
        import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int lastFirst = num_list[num_list.length -1];
        int lastSecond = num_list[num_list.length -2];

        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());


        list.add(lastFirst - lastSecond > 0 ? lastFirst - lastSecond : lastFirst * 2);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}