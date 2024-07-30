class Solution {
    public int[] solution(int start_num, int end_num) {
        int length = end_num - start_num + 1;
        int[] answer = new int[length];

        int start = start_num; // 문제 흐름대로 하다보니 굳이 불필요한 변수 쓰게 되는 경우가 생기게 된다. >> 리팩토링 시 살펴볼 것
        for (int i = 0; i < length; i++){
            answer[i] = start;
            start++;
        }
        /*int[] answer = new int[end - start+1];
        for(int i =0; i<= end - start; i++) {
            answer[i] = start + i;
        }*/

        return answer;

    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}