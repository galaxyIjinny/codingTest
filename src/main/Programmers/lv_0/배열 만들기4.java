import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}

//
import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack;

        //
        for (int num : arr) {
            while (!stack.isEmpty() && num <= stack.peek())
                stack.pop();
            stack.push(num);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}