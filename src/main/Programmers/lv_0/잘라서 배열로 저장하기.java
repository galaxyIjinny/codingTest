class Solution {
    public String[] solution(String my_str, int n) {
        int remainder = my_str.length() % n;
        String[] answer;
        if (remainder == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }

        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (remainder != 0 && i == answer.length - 1) {
                for (int j = 0; j < remainder; j++) {
                    sb.append(my_str.charAt(i * n + j));
                }
                answer[i] = sb.toString();
            } else {
                for (int j = 0; j < n; j++) {
                    sb.append(my_str.charAt(i * n + j));
                }
                answer[i] = sb.toString();
            }
        }

        return answer;

        //
        /*int resultCnt = (my_str.length() + n - 1) / n;
        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
            //
            answer[i] = (i * n + n <= my_str.length() - 1 ? my_str.substring(i * n, i * n + n) : my_str.substring(i * n));
        }*/
    }
}

//

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myStr, int n) {
        return IntStream.range(0, myStr.length() / n + (myStr.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray()Stringp[::new];
    }
}