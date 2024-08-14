class Solution {
    public int solution(int order) {
        int answer = 0;

        while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }
            order /= 10;
        }

        //
        /*String str = order + "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='3'||c=='6'||c=='9') answer++;
        }*/

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9)
                .count();
    }
}

// 정규표현식

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class Solution {
    private static final Pattern PATTERN = Pattern.compile("[369]");

    public int solution(int order) {
        Matcher matcher = PATTERN.matcher(String.valueOf(order));
        return (int) Stream.generate(() -> "")
                .takeWhile(__ -> matcher.find())
                .count();
    }
}