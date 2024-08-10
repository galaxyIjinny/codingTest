class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            // 아스키코드 확인 후 26 구분해서 변수 이어붙일 수 있도록
            // answer[my_string.charAt(i) - 65]++;
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if ( c>= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            }
            //
            if (c >= 65 && c <= 90) {
                answer[c - 'A']++;
            } else if (c >= 97 && c <= 122) {
                answer[c - 'A' - 6]++;
            }
        }

        //
        /*for (char ch : my_string.toCharArray()) {
            answer[ch - 'A' - (Character.isLowerCase(ch) ? 6 : 0)]++;
        }*/

        return answer;
    }
}

//

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String my_string) {
        return IntStream.concat(IntStream.concat(my_string.chars(), IntStream.rangeClosed('A', 'Z')), IntStream.rangeClosed('a', 'z'))
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream()
                .mapToInt(i -> i.intValue() - 1)
                .toArray();
    }