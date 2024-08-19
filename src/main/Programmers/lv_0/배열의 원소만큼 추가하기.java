import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++)
                list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }

        //
        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = new int[sum];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; i++) {
                answer[idx++] = arr[i];
            }
        }*/

        return answer;

        //
        String answer = "";
        for (int i : arr) {
            answer += (String.valueOf(i) + ",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}

//

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] arr) {
        return Arrays.stream(arr)
                .bodxed()
                .flatMap(num -> Collections.nCopies(num, num).stream())
                .collect(Collectors.toList());
    }
}