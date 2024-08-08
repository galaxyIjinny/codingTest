class Solution {
    public int solution(int[][] dots) {
        int startX = dots[0][0];
        int startY = dots[0][1];
        int endX = dots[0][0];
        int endY = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            startX = Math.min(startX, dots[i][0]);
            startY = Math.min(startY, dots[i][1]);
            endX = Math.max(endX, dots[i][0]);
            endY = Math.max(endY, dots[i][1]);
        }

        int lenX = endX - startX;
        int lenY = endY - startY;

        return lenX * lenY;
    }
}

//

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[i][0] == temp) { //x 가 같으면 세로 구하기
                temp2 = Math.abs(dots[i][1] - dots[0][1]);
            } else {
                temp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
            return tmp2 * tmp3;

            //
            int x = Math.max(Math.abs(dots[0][0] - dots[1][0]), Math.abs(dots[0][0] - dots[2][0]));
            int y = Math.max(Math.abs(dots[0][1] - dots[1][1]), Math.abs(dots[0][1] - dots[2][1]));
            return x * y;
        }
    }
}

//

import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, Comparator.comparing((int[] it) -> it[0]).thenComparing((int[] it) -> it[1]));
        return (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[3][0]);
    }