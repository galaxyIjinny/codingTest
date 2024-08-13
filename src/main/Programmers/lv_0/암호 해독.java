class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }
        //
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        return sb.toString();
    }
}

//

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}