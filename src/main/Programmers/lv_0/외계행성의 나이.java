class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= age; i *= 10) {
            char digit = (char) (age % (i * 10) / i + 'a');
            sb.append(digit);
        }

        return sb.reverse().toString();
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while (age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }
}

//

import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars()
                .mapToObj(operand -> String.valueOf((char) (49 + operand)))
                .collect(Collectors.joining());
    }
}