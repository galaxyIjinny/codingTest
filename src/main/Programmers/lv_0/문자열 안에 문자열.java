class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;

        //
        boolean result = false;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            if (c == str2.charAt(0)) {
                int len = i + str2.length();
                String str = (len < str1.length() ? str1.substring(i, len) : str1.substring(i);

                if (str.equals(str2)) {
                    result = true;
                    break;
                }
            }
        }
            if (result) answer = 1;
            else answer = 2;

            return answer;
    }
}