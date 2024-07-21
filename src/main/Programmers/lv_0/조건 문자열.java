// 함수 사용

import java.util.Map;
import java.util.function.BiFunction;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}

// boolean 이용

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        if (ineq.equals(">") && eq.equals("="))
            answer = n >= m;
        else if (ineq.equals("<") && eq.equals("="))
            answer = n <= m;
        else if (ineq.equals(">") && eq.equals("!"))
            answer = n > m;
        else
            answer = n < m;
        return answer ? 1 : 0;
    }
}

// 내가 구현한 코드. 리팩토링 필요
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) {
                answer = 1;
            } else {
                answer = 0;
            }
        }

        // 더 간추릴 수 있었음
        // if(ineq.equals(">")){
        //            if(eq.equals("=")){
        //                if(n >= m){
        //                    answer = 1;
        //                }
        //            }
        //            else if(eq.equals("!")){
        //                if(n > m){
        //                    answer = 1;
        //                }
        //            }
        //        }
        //        else if(ineq.equals("<")){
        //            if(eq.equals("=")){
        //                if(n <= m){
        //                    answer = 1;
        //                }
        //            }
        //            else if(eq.equals("!")){
        //                if(n < m){
        //                    answer = 1;
        //                }
        //

        // 문자열 붙이는 방식
        /* String str = ineq + eq;
                if (str.equals(">=")) {
                    if (n>=m) answer = 1;
                    else answer = 0;
                }*/

        // 한 줄
        // return eq.equals("=") ? ineq.equals("<") ? n <= m ? 1 : 0 : n >= m ? 1 : 0 : ineq.equals("<") ? n < m ? 1 : 0 : n > m ? 1 : 0;
        //
        // return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
        //

        return answer;
    }
}