class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        answer[0] = arr[0];
        for (int i = 1; i < k; i++) {
            answer[i] = -1;
        }

        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) { // 더 뒤에서 중복된 수가 나오는 경우 검증 불가
                answer[idx] = arr[i];
                idx++;
            }
            if (idx == k) break;
        }

        // 정답 풀이
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                answer[count++] = arr[i];
                set.add(arr[i]);
            }
            if (count == answer.length) break;
        }

        return answer;
    }
}

//
import java.util.*;

class Solution {
    private static final int NOT_FOUND = -1;
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, NOT_FOUND);
        Set<Integer> used = new HashSet<>();
        int idx = 0;

        for (int num : arr) {
            if (!used.contains(num)) {
                answer[idx++] = num;
                used.add(num);
            }
            if (idx >= k) break;
        }

        return answer;
    }
}

//

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream
                .concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1))
                .limit(k)
                .toArray();
        return IntStream.range(0, k)
                .map(i -> i >= Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.toSet()).size() ? -1 : Arrays.stream(arr)
                                .distinct()
                                .toArray()[i])
                .toArray();

    }