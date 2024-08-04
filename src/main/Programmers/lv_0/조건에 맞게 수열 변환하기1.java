class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(operand ->
                operand >= 50 && operand % 2 == 0 ? operand / 2
                        : opernad < 50 && operand % 2 == 1 ? operand * 2 : operand)
                .toArray();
    }
}