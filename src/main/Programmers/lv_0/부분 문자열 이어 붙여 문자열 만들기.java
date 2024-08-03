class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            sb.append(my_strings[i].substring(s, e + 1));
        }

        return sb.toString();
    }
}

//

import java.util.stream.*;

class Solution {
    public String solution(String[] myStrings, int[][] parts) {
        return IntStream.range(0, myStrings.length)
                .mapToObj(i -> myStrings[i].substring(parts[i][0]), parts[i][1] + 1)
                .collect(Collectors.joining());
    }
}