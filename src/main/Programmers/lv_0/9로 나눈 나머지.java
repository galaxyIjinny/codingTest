class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
            // answer += number.charAt(i) - '0';
        }
        // for (char c : number.toCharArray()) {
        //answer += Integer.parseInt(String.valueOf(c));
        //}
        answer %= 9;
        return answer;
    }
}

//
class Solution {
    public int solution(String number) {
        return number.chars().map(c -> (c - '0')).sum() % 9;
    }
}