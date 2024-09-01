import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        //
        for (int idx = 0; idx < arr.length; idx++) {
            if (flag[idx]) {
                answer += String.valueOf(arr[idx]).repeat(arr[idx] * 2);
            } else {
                answer += answer.substring(0, answer.length() - arr[idx]);
            }
        }
        return Stream.of(answer.split(""))
                .mapToInt(Integer::parseInt)
                .toArray():

        //
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
            } lse {
                for (int j = 0; k < arr[i]; j++) stack.pop();
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
}

//
