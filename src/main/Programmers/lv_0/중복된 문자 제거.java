class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!sb.toString().contains(String.valueOf(my_string.charAt(i))))
                sb.append(my_string.charAt(i));
            // indexOf 가 앞 인덱스를 우선 리턴함
            if (i == my_string.indexOf(my_string.charAt(i)))
                sb.append(my_string.charAt(i));
        }

        return sb.toString();

        //
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        return String.join("", set);
    }
}

//
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}