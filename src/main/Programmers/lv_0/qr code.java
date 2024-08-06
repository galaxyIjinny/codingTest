class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) sb.append(code.charAt(i));
        }
        /*for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));*/

        return sb.toString();
    }
}

//

import java.util.stream.*;

class Solution {
    public String solution(int q, int r, String code) {
        return IntStream.range(0, code.length()).filter(operand -> operand % q == r).mapToObj(i -> String.valueOf(code.charAt(i))).collect(Collectors.joining());
    }
}