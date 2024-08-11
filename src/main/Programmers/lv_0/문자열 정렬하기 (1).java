import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        //
        /*my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }*/

        Arrays.sort(answer);

        return answer;
        // return list.stream().sorted().mapToInt(Integer::parseInt).toArray();
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(String myString) {
        Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split(""))
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}