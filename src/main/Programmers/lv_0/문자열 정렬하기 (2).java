class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string.toLowerCase());

        Arrays.sort(sb.toString().toCharArray());

        return sb.toString();

        //
        public String solution(String my_string) {
            char[] c = my_string.toLowerCase().toCharArray();
            Arrays.sort(c);

            return new String(c); // 생성자 매개변수 타입 확인
        }
        //
        String[] s = my_string.toLowerCase().split("");
        Arrays.sort(s);
    }
}

//

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.toLowerCase(Locale.ROOT)) // https://zorba10004.tistory.com/400  매개변수 참고
                .split("")
                .sorted()
                .collect(Collectors.joining());
        //
        return my_string.toLowerCase()
            .chars()
            .sorted()
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }