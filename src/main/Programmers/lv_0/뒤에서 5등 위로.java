import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        //
        /*for (int i = 5; i < num_List.length; i++ {
            answer[i - 5] = num_list[i];
        }*/

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList) // == stream(new int[] {}) == IntStram.of(numList)
                .sorted()
                .skip(5)
                .toArray();
    }
}