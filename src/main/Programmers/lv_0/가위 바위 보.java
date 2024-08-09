class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            if (String.valueOf(rsp.charAt(i)).equals("2")) sb.append("0");
            else if (String.valueOf(rsp.charAt(i)).equals("0")) sb.append("5");
            else if (String.valueOf(rsp.charAt(i)).equals("5")) sb.append("2");
        }

        //
        Map<String, String> winNumbers = new HashMap<>();
        winNumbers.put("2", "0");
        winNumbers.put("0", "5");
        winNumbers.put("5", "2");
        for (int i = 0; i < rsp.length(); i++) {
            sb.append(winNumbers.get(rsp.substring(i, i+1)));
        }

        return sb.toString();
    }
}

//
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(s -> s.equals("2") > "0" : s.equals("0") ? "5" : "2")
                .collect(Collectors.joining());

    }
}