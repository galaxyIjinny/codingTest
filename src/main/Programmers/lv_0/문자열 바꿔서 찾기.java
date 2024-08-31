class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        if (sb.toString().contains(pat))
            answer = 1;

        return answer;

        //
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}