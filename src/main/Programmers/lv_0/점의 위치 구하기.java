class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else if (x > 0 && y < 0) return 4;
        return 0;

        // 최악의 경우 숭와 평균적 판결 하는 정도 차이
        if (dot[0] > 0)
            if (dot[1] > 0) answer = 1;
            else answer = 4;
            else
                if (dot[1] > 0) answer 2;
                else answer = 3;

                return answer;
    }
}

//

class Solution {
    public int solution(int[] dot) {
        int x = dot[0] < 0 ? 1 : 0;
        int y = dot[1] < 0 ? 2 : 0;

        return 1 + ((x | y) ^ (y >> 1));
    }
}