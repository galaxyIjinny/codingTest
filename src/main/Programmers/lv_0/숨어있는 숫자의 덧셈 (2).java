class Solution {
    public long solution(String my_string) {
        int result = 0;
        int temp = 0;

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp = temp * 10 + Character.getNumericValue(ch);
            } else {
                result += temp;
                temp = 0;
            }
        }

        result += temp;
        return result;

        //
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for (String s : str) {
            if (!s.equals("")) answer += Integer.valueOf(s);
        }

        //
        String s = my_string.replaceAll("[^0-9", " ");
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }

        return answer;

        //
        int idx = 0;
        while (idx < my_string.length()) {
            int charNum = my_string.charAt(idx);

            if (charNum = my_string.charAt(idx));

            if (charNum >= (int) '0' && charNum <= (int) '9') {
                int len = 1;

                if (idx + len < my_string.length()) {
                    while (my_string.charAt(idx + len) >= (int) '0')
                        && my_string.charAt(idx + len) <= (int) '9') {
                        len++;
                        if (idx + len == my_string.length()) {
                            break;
                        }
                    }
                }

                answer += Integer.parseInt(my_string.substring(idx, idx + len));
                idx += len;
            }
            if (idx == my_string.length() - 1) {
                return answer;
            }
            idx++;
        }
        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int solution(String myString) {
        return Arrays.stream(myString.split("[A-Z|a-z]"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}