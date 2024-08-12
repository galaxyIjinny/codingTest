import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 2;

        Arrays.sort(sides);
        int max = sides[2];

        if (max < sides[0] + sides[1])
            answer = 1;

        return answer;
        //return sides[2] >= sides[0]+sides[1] ? 2 : 1;

        //
        /*int A = sides[0] + sides[1];
        int B = sides[1] + sides[2];
        int C = sides[0] + sides[2];

        if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
        else return 1;*/
    }
}