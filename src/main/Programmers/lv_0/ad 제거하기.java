import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //
        /*List<String> list = Arrazys.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
        String[] answer = new String[list.size()];
        list.toArray(answer);*/

        return answer; // return list.toArray(Stringp[::new);
    }
}

//

import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }