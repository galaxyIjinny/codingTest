class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String before = my_string.substring(0, s);
        answer = before.concat(overwrite_string);

        if (my_string.length() > s + overwrite_string.length()) {
            String after = my_string.substring(s + overwrite_string.length(), my_string.length());
            answer = answer.concat(after);
        }

        return answer;
    }
}