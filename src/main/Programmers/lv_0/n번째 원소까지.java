class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
        // return Arrays.copyOf(num_list, n);
    }
}

import java.util.*;

class Solution {
    public Integer[] solution(int[] numList, int n) {
        return Arrays.stream(numList).boxed().limit(n).toArray(Integer::new);
    }