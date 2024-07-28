class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int n = 0; n < queries.length; n++) {
            int min = Integer.MAX_VALUE;
            for (int i = queries[n][0]; i <= queries[n][1]; i++) {
                if (arr[i] > queries[n][2] && arr[i] < min) {
                    min = arr[i];
                }
            }

            min = min == Integer.MAX_VALUE ? -1 : min;
            answer[n] = min;
        }
        
        // 가독성
        int idx = 0;
        int[] answer = new int[queries.length];

        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];
            int min = Integer.MAX_VALUE;

            for (int i = s;i <= e;i++)
                if (arr[i] > k)
                    min = Math.min(arr[i], min);

            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
        }

        return answer;
    }
}

//
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }

        }

        return answer;
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
    }
}



// 실수

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(arr); // 정렬부터 하면 불규칙한 배열과 상관없이 앞에서 끝나므로 안됌

        for (int n = 0; n < queries.length; n++) {
            int temp = -1;
            for (int i = queries[n][0]; i <= queries[n][1]; i++) {
                if (arr[i] > queries[n][2]) {
                    temp = arr[i];
                    continue;
                }
            }
            answer[n] = temp;
        }

        return answer;
    }
}