import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][0] - intervals[1][1] + 2];

        int[] answer1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] answer2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        System.arraycopy(answer1, 0, answer, 0, answer1.length);
        System.arraycopy(answer2, 0, answer, answer.length, answer2.length);
        // 시작점 입력 실수로 틀린 듯. 아래처럼 고처야함
        /*int x1 = intervals[0][0];
        int y1 = intervals[0][1];
        int x2 = intervals[1][0];
        int y2 = intervals[1][1];
        int[] answer = new int[(y1 - x1 + 1) + (y2 - x2 + 1)];

        System.arraycopy(arr, x1, answer, 0, y1 - x1 + 1);
        System.arraycopy(arr, x2, answer, y1 - x1 + 1, y2 - x2 + 1);*/

        //
        /*int[] answer = new int[y1 - x1 + y2 - x2 + 2];
        int idx = 0;
        for (int i = x1; i <= y1; i++) {
            answer[idx++] = arr[i];
        }

        for (int i = x2; i <= y2; i++) {
            answer[idx++] = arr[i];
        }*/

        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1)))
                .toArray());
    }
}