import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                //list.add(sb.toString());  //"axxbxx" 처럼 x가 연속으로 나오는 경우 방지
                if (sb.length() > 0)
                    list.add(sb.toString());
                sb = new StringBuilder();
            } else if (c != ' ') {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        String[] answer = list.toArray(String[]::new);

        Arrays.sort(answer);

        return answer;

        //
        /*Spring[] split = myString.split("x");
        ArrayList <String> al = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                al.add(split[i]);
            }
        }
        answer = new String[[al.size()];]
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        Arrays.sort(answer);
        return answer;*/

        //
        StringTokenizer st = new StringTokenizer(myString, "x");
        int idx = 0, N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0; n < N; n++) {
            result[idx++] = st.nextToken();
        }
        Arrays.sort(result);
        return result;
    }
}

//

import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
        //
        //return Stream.of(myString.split("x")).filter(str->str.length()>0).sorted().toArray(String[]::new);
    }