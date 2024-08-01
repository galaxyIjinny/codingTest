class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int i : index_list) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}

//

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int[] indexList) {
        return Arrays.stream(indexList)
                .mapToObj(operand -> String.valueOf(myString.charAt(operand)))
                .collect(Collectors.joining());
    }
}