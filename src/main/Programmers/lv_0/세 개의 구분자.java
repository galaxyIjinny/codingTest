import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) { // 마지막 것도 추가해야함
            list.add(sb.toString());
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if (list.isEmpty()) answer = new String[] {"EMPTY"};

        return answer;
        //
        /*myStr = myStr.replaceAll("a|b|c", " ");
        String[] split = myStr.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                list.add(split[i]);
            }
        }*/


        // 연속되면 반례 생김
        public String[] solution(String myStr) {
            String newStr = myStr.replace("a", " ");
            newStr = newStr.replace("b", " ");
            newStr = newStr.replace("c", " ");

            String[] answer = newStr.trim().split(" ");

            if (answer[0].isEmpty()) answer = new String[] { "EMPTY" };

            return answer;

            // 옳은 풀이
            myStr = myStr.replaceAll("[a|b|c]+", ",");
            myStr = myStr.charAt(0) == "," ? myStr.substring(1) : myStr;
            myStr = myStr.equals("") ? "EMPTY" : myStr;

            return myStr.split("[,]");
        }
    }
}

//
import java.util.StringTokenizer;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        if (st.countTokens() != 0) {
            answer = new String[st.countTokens()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = st.nextToken();
            }
        } else {
            answer = new String[1];
            answer[0] = "EMPTY";
        }

        return answer;
    }

//

import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = Arrays.stream(myStr.split("[abc]+"))
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
        return arr.length == 0 ? new String[] {"EMPTY"} : arr;
    }
}