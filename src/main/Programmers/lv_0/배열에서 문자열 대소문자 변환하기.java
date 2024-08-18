class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
            //
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUppserCase();
        }

        return answer;
    }
}

//

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }
}