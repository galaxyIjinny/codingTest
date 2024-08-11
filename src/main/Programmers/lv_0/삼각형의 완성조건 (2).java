class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i = 1; i < max; i++) {
            if (i <= min && min + i > max) {
                answer++;
            } else if (i > min && min + i > max) {
                answer++;
            }
        }
        for (int i = max; i < max + min; i++) {
            answer++;
        }

        //
        /*for (int i = 1; i < sides[0] + sides[1]; i++) {
            if (i > max) {
                if (min + max > i) answer++;
            } else {
                if (min + i > max) answer++;
            }
        }*/

        //answer = max - min - 1 + max + min - 1; // 좀 더 생각해볼걸...
        // answer += min * 2 - 1 // 정답

        return answer;
    }
}

//
class Solution {
    public int solution(int[] sides) {
        return Math.max(sides[0], sides[1]) - (Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1])) + (sides[0] + sides[1]) - Math.max(sides[0], sides[1]) - 1;
    }
}