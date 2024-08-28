class Solution {
    public String solution(String n_str) {
        int startStr = 0;
        int len = n_str.length();

        for (int i = 0; i < len; i++) {
            if (n_str.charAt(i) != '0') {
                startStr = i;
                break;
            }
        }
        String answer = n_str.substring(startStr, len);

        return answer;
        //return "" + Integer.parseInt(n_str);

        //
        /*StringBuilder sb = new StringBuilder(n_str);
        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();*/
    }
}