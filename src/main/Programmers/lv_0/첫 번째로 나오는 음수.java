class Solution {
    public int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
                //return i;
            }
        }

        return answer;
        //return -1;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList) {
        return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
    }
}