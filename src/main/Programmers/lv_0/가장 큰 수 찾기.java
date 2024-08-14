import java.util.*;

class Solution {
    public int[] solution(int[] array) { // 너무 어렵게 생각한 듯
        int len = array.length;
        int[] copyArr = Arrays.copyOf(array, len);
        Arrays.sort(copyArr);

        int[] answer = new int[2];
        for (int i = 0; i < len; i++) {
            if (array[i] == copyArr[len - 1]) {
                answer[0] = copyArr[len - 1];
                answer[1] = i;
            }
        }

        return answer;

        //
        /*for (int i = 0; i < len; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }*/
    }
}

//

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collector.toList());
        int max = list.stream() max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[]{max, index};
    }
}
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        return IntStream.range(0, array.length)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, array[i]))
                .max(Map.Entry.comparingByValue())
                .map(entry -> new int[]{entry.getValue(), entry.getKey()})
                .orElseThrow();
    }
}