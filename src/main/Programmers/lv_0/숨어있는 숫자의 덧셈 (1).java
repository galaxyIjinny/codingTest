class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (char c : my_string.toCharArray()) {
            if (c < 65) { // = if (Character.digit(my_string.charAt(i), 10) > 0)
                answer += Integer.parseInt(String.valueOf(c));
            }
            //
            answer += Character.getNumbericValue(ch);
            // char 타입 변환, 아스키 코드
            /*if (c >= '0' && c <= '9') {
                answer += c - '0';
            }*/
        }

        return answer;
    }
}

//

class Solution {
    public int solution(String myString) {
        return myString.chars().mapToObj(i -> (char) i)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .mapToInt(Integer::valueOf).sum();
    }