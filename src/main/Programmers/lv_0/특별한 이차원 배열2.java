class Solution {
    public int solution(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) return 0;

                //
                /*if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                }
                else {
                    answer = 0;
                    break;
                }*/
            }
        }
        return 1;
    }
}

//

import java.util.stream.*;

class Solution {
    public int solution(int[][] arr) {
        return IntStream.range(0, arr.length)
                .allMatch(i -> IntStream.range(i + 1, arr.length)
                        .allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
    }
}