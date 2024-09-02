import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {

            if (i % 2 == 0) {
                list = list.subList(0, query[i] + 1);
            } else {
                list = list.subList(query[i], list.size());
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        //
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] + 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}

//
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        return IntStream.range(0, query.length)
                .boxed()
                .reduce(arr, (current, next) -> next % 2 == 0 ?
                                Arrays.copyOfRange(current, 0, query[next] + 1) :
                                Arrays.copyOfRange(current, query[next], current.length),
                        (a, b) -> a);
    }
}

import java.util.AbstractMap.SimpleEntry;
import java.util.stream.*;
import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int[] query) {
        SimpleEntry<Integer, Integer> se = IntStream.range(0, query.length).boxed().reduce(
                new SimpleEntry<>(0, 0),
                (acc, i) -> i % 2 == 1 ? new SimpleEntry<>(acc.getKey() + query[i], acc.getValue()) : new SimpleEntry<>(acc.getKey(), acc.getKey() + query[i]),
                (a, b) -> null
        );
        return se.getKey().equals(se.getValue()) ? new int[] {-1} : Arrays.copyOfRange(arr, se.getKey(), se.getValue());
    }
}