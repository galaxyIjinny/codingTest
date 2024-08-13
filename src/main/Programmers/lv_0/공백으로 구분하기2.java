import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();

        for (String word : arr) {
            if (!word.equals("")) {
                list.add(word);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        //
        /*StringTokenizer st = new StringTokenizzer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0; n < N; n++) {
            result[n] = st.nextToken();
        }
        return result;*/
    }
}

//
class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("[ ]+");
        //return my_string.trim().split("\\s+");
    }
}

//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.trim().split(" ")).filter(x -> !x.equals("")).toArray(String[]::new);
        //return Stream.of(my_string.split(" ")).filter(str -> str.length()>0).toArray(String[]::new);
    }
}