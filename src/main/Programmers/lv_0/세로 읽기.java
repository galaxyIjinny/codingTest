class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i += m) {
            String str = my_string.substring(i, i + m);
            sb.append(str.charAt(c - 1));
        }
        /*for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }*/

        return sb.toString();
    }
}

//

import java.util.stream.*;

class Solution {
    public String solution(String myString, int m, int c) {
        return IntStream.range(0, myString.length())
                .filter(i -> i % m == c - 1)
                .mapToObj(i -> String.valueOf(myString.charAt(i)))
                .collect(Collectors.joining());
    }
}