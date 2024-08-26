import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Objects;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (String ch : s.split("")) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sb.append(ch);
            }
        }
        String beforeArray = sb.toString();
        char[] chars = beforeArray.toCharArray();
        Arrays.sort(chars);

        String answer = new String (chars);

        return answer;

        //
        int[] alpha = new int[26];
        for (char c : s.toCharArray()) {
            alpha[c - 'a']++;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == 1) {
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();

        //
        char[] chars = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap();
        for (char c : chars) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : charMap.keySet()) {
            if (charMap.get(c) == 1) {
                sb.append(c);
            }
        }

        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}

//

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}