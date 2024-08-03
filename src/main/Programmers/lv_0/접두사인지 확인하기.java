class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(0, i).equals(is_prefix)) {
                answer++; // answer = 1; 로 하는 것이 만약의 오류 대비에 좋을 듯
            }
        }
        return answer;

        //
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;

        return my_string.indexOf(is_prefix) == 0 ? 1 : 0;
    }
}

//

import java.util.*;
        import java.util.stream.*;

class Solution {
    public int solution(String myString, String isPrefix) {
        return IntStream.rangeClosed(0, myString.length())
                .mapToObj(i -> myString.substring(0, i))
                .anyMatch(s -> s.equals(isPrefix)) ? 1 : 0;
    }
}