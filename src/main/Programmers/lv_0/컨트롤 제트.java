class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] str = s.split(" ");
        int idx = 0;
        for (String i : str) {
            if (i.equals("Z")) {
                answer -= Integer.parseInt(str[idx - 1]); // Z 인식 부분에서 오류
            } else {
                answer += Integer.parseInt(i);
                idx++;
            }
        }
        //
        int lastNum = 0;

        for (String i : str) {
            if (i.equals("Z")) {
                answer -= lastNum;
            } else {
                lastNum = Integer.parseInt(i);
                answer += lastNum;
            }
        }

        return answer;
    }
}

//

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            stack.pop();
        } else {
            stack.push(Integer.parseInt(w));
        }
    }

    for (int i : stack) {
        answer += i;
    }
    //
    while (!stack.empty()) {
        answer += Integer.parseInt(stack.pop());

    return answer;
    }
}