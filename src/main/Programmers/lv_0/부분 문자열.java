class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if (str2.contains(str1))
            answer = 1;

        return answer;
        //return str2.contains(str1) ? 1 : 0;
        //return str2.length() == str2.replace(str1, "").length() ? 0 : 1;
        //
        int a = str2.indexof(str1);
        return a >= 0 ? 1 : 0;
    }
}