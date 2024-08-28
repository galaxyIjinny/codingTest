class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    answer[i][j] = 1;
            }
        }
        //
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        //
        Arrays.setAll(answer, o -> {
            int[] array = answer[i];
            array[i] = 1;
            return array;
        });

        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int n) {
        return InteStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n).map(j -> j == i ? 1 : 0))
                .toArray();
    }
}