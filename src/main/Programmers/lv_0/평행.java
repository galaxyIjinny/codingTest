class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        double angleA = getAngle(dots[0], dots[1]);
        double angleB = getAngle(dots[2], dots[3]);

        if (angleA == angleB) {
            answer = 1;
        } else {
            angleA = getAngle(dots[0], dots[2]);
            angleB = getAngle(dots[1], dots[3]);

            if (angleA == angleB) {
                answer = 1;
            } else {
                angleA = getAngle(dots[0], dots[3]);
                angleB = getAngle(dots[1], dots[2]);

                if (angleA == angleB) {
                    answer = 1;
                } else answer = 0;
            }
        }

        // 아래처럼 줄일 수 있음
        /*if (getAngle(dots[0], dots[1]) == getAngle(dots[2], dots[3]))
            return 1;
        if (getAngle(dots[0], dots[2]) == getAngle(dots[1], dots[3]))
            return 1;
        if (getAngle(dots[0], dots[3]) == getAngle(dots[1], dots[2]))
            return 1;*/

        return answer;
    }

    public double getAngle(int[] a, int[] b) { // 기울기 소수점을 위해 double로 반환 필요
        return (Math.abs(a[1] - b[1])) / (double)(Math.abs(a[0] - b[0]));
    }
}

//
class Solution {
    int[][] dots;

    public int solution(int[][] dots) {
        this.dots = dots;
        if (parallet(0, 1, 2, 3)) return 1;
        if (parallet(0, 2, 1, 3)) return 1;
        if (parallet(0, 3, 1, 2)) return 1;
        return 0;
    }

    boolean parallel(int a, int b, int c, int d) {
    int x = (dots[a][0] - dots[b][0]) * (dots[c][1] - dots[d][1]);
    int y = (dots[a][1] - dots[b][1]) * (dots[c][0] - dots[d][0]);
    return x == y || x == -y;
    }
}