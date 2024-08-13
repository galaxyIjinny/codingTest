class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                .map(operand -> k % 2 == 0 ? operand + k : operand * k)
                .toArray();

        //
        /*if(k%2==0) {
            return IntStream.of(arr).map(i->i+k).toArray();
        }
        return IntStream.of(arr).map(i->i*k).toArray();*/
    }
}