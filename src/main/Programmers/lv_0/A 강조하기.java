class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'a') { // 따로 고려 말고 다 소문자로 바꾸고 시작하는 것이 나았다.
                sb.append(String.valueOf(c).toUpperCase());
            } else if (c == 'A') {
                sb.append(c);
            } else {
                sb.append(String.valueOf(c).toLowerCase());
            }
        }
        return sb.toString();

        //
        sb.append(myString.toLowerCase());
        sb.replace('a', 'A');
        return sb.toString();
        //return myString.toLowerCase().replaceAll("a", "A");
    }
}

//

import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(c -> String.valueOf((char) (c == 97 || c == 65 ?
                        Character.toUpperCase(c) : Character.toLowerCase(c))))
                .collect(Collectors.joining());
    }