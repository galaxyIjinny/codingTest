import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] arr = emergency.clone();
        // int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        int[] answer = new int[len];

        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= len; i++) {
            map.put(arr[len - i], i);
        }

        for (int i = 0; i < len; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}

//


class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if (answer[i] != 0) {
                continue;
            }
            int idx = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emeergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}

//

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] e) {
        return Arrays.stream(e)
                .map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()))
                .collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}