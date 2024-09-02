class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                sb.append("l");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();

        //
        return myString.replaceAll("[^l-z]", "l");
        return myString.replaceAll("[a-k]", "l");
    }
}

//
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
                .collect(Collectors.joining());
    }
}