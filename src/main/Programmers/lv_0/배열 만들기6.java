import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else {
                if (arr[i] == list.get(list.size() - 1)) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(arr[i]);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return list.isEmpty() ? new int[]{-1} : answer;

        //
        Stack<Integer> stack = new Stack<>();
        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] {-1} : stack.stream().mapToInt(i -> i).toArray();
    }
}