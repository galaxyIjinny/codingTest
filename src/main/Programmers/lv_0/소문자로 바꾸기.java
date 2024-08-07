class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}

//
class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            sb.append(Character.toLowerCase(c));
            //
            /*if (c > 'A' && c <= 'Z') {
                sb.append((char) ((int)c + 32));
            } else
                sb.append(c);*/
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
