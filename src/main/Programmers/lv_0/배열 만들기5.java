import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (String str : intStrs) {
            int result = Integer.parseInt(str.substring(s, s + l));

            if (result > k) {
                answer.add(result);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(value -> Integer.parseInt(value.substring(s, s + l)))
                .filter(value -> value > k)
                .toArray();
    }
}