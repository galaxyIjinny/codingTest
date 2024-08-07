import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string);
        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }

        return sb.toString();

        //
            StringBuilder sb = new StringBuilder(my_string);
            for (int i : indices) {
                sb.setCharAt(i, ' ');
            }
            return sb.toString().replace(" ", "");
        //
        String[] tmp = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }
        for (String x : tmp) {
            sb.append(x);
        }
        return sb.toString();
    }
}

//

import java.util.stream.*;

class Solution {
    public String solution(String myString, int[] indices) {
        return IntStream.range(0, myString.length()).filter(i -> !IntStream.of(indices).boxed().collect(Collectors.toSet()).contains(i)).mapToObj(myString::charAt).map(Object::toString).collect(Collectors.joining());
    }
}