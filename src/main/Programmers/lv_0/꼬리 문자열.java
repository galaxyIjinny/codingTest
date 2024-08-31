class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (String str : str_list) {
            if (!str.contains(ex))
                sb.append(str);
        }

        return sb.toString();
    }
}

//
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] strList, String ex) {
        return Arrays.stream(strList)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());
    }
}