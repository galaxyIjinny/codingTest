class Solution {
    public int solution(String num_str) {
        // 런타임 에러 발생
        int answer = 0;

        /*int num = Integer.parseInt(num_str);
        while (num > 0) {
            answer += num % 10;
            num /= 10;
        }*/
        //
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
            //answer += (int)num_str.charAt(i) - 48;
        }

        return answer;
    }
}

//

import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
        //return numStr.chars().map(c -> c - 48).sum(); // 아스키 '0' == 48
    }