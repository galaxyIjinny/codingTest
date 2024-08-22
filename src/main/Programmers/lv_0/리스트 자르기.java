import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch(n) {
            case 1:
                answer = Arrays.copyOf(num_list, slicer[1] + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length + 1);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                break;
            case 4:
                int len = (slicer[1] - slicer[0]) / slicer[2] + 1;
                answer = new int[len];
                for (int i = 0; i < len; i++) {
                    answer[i] = num_list[slicer[0] + i * slicer[2]];
                }
                //
                //answer = IntStream.range(0, (b - a) / c + 1).map(i -> num_list[a + i * c]).toArray()
                break;
        }

        //
        /*int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }*/
        return answer;
    }
}

//

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] numList) {
        return IntStream
                .iterate(n == 1 ? 0 : slicer[0], i -> i <= (n == 2 ? numList.length - 1 : slicer[1]), i -> n == 4 ? i + slicer[2] : i + 1)
                .map(i -> numList[i])
                .toArray();
    }
}