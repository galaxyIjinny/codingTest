class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            if (i < num_list.length - n) {
                answer[i] = num_list[i + n];
            } else {
                answer[i] = num_list[i - (num_list.length - n)];
            }
        }

        //
        /*int l = num_list.length;
        for (int i = 0; i < l; i++) {
            answer[i] = num_list[(i + n) % l];
        }*/

        return answer;
    }
}

//
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        int[] copy = Arrays.copyOf(numList, numList.length * 2);

        System.arraycopy(numList, 0, copy, numList.length, numList.length);
        return Arrays.copyOfRange(copy, n, n + numList.length);
    }


//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.lenght)
                .map(i -> num_list[(i + n) % num_list.length]) // 초과시킨 후 나머지 값을 통해 앞뒤 인덱스 바꾸기
                .toArray();
    }
}