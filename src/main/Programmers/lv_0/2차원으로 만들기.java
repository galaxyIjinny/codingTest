class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[i * n + j];
            }
        }

        /*for (int i = 0; i < num_list.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }*/

        /*int chk = 0;
        for (int i = 0; i <= num_list.length - 1; i += n) {
            int[] a = Arrays.copyOfRange(num_list, i, i + n);
            answer[chk] = a;
            chk++;
        }*/

        return answer;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length / n)
                .mapToObj(i -> IntStream.range(0, n)
                        .map(j -> num_list[i * n + j])
                        .toArray())
                .toArray(int[][]::new);
    }
}