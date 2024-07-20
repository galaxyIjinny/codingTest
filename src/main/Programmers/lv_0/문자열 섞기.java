class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
        }

        return answer;

        //
        StringBuilder sb = new StringBuilder();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1arr[i]).append(str2arr[i]);
        }

        return sb.toString();

        //
        StringBuilder sb = new StringBuilder();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            sb.append(chars1[i]).append(chars2[i]);
        }

        return sb.toString()
    }
}