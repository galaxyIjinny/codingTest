class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].equals("+"))
                answer += Integer.parseInt(arr[i + 1]);
            else
                answer -= Integer.parseInt(arr[i + 1]);
        }
        //
        /*boolean sign = true;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                answer += sign ? Integer.parseInt(arr[i]) : -Integer.parseInt(arr[i]);
            } else {
                sign = arr[i].equals("+");
            }
        }*/
        /*int oper = 1;
        for (String s : arr) {
            if (s.quals("+") || s.equals("-")) {
                oper = s.equlas("-") ? -1 : 1;
            } else {
                answer += Integer.parseInt(s) * oper;
            }
        }*/

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+]", "").trim().split(" "))
                .mapToInt(Integer::parseInt).sum();
    }
}