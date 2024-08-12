import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for (int i : numlist) {
            if (i % n == 0)
                list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
        // list.stream().mapToInt(x -> x).toArray();

        //
        int count = 0;
        for(int i : numlist){
            if(i%n==0){
                count++;
            }
        }

        int[] answer = new int[count];
        int idx = 0;
        for(int i : numlist){
            if(i%n==0){
                answer[idx]=i;
                idx++;
            }
        }


        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList)
                .filter(value -> value % n == 0)
                .toArray();
    }
}