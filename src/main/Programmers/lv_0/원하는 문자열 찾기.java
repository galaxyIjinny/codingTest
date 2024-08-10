class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        if (myString.length() < pat.length()) answer = 0;
        else {
            if (myString.toUpperCase().contains(pat.toUpperCase()))
                answer = 1;
        }
        //
        /*String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            return 1;
        }
        return 0;*/

        return answer;
    }
}