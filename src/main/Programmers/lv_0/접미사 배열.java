import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        /*String[] answer = new String[my_string.length()];

        for (int i = 0; i <answer.length; i++) {
            answer[i] = my_string.substring(i);
        }*/

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);

        return answer;
    }
}

//

import java.util.*;
        import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myString) {
        return IntStream.range(0, myString.length())
                .ampToObj(myString::substring).sorted().toArray(String[]::new);
    }
}