class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (letter.equals(String.valueOf(my_string.charAt(i)))) continue;
            sb.append(String.valueOf(my_string.charAt(i)));
        }

        /*char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch != letter.charAt(0)) {
                sb.append(ch);
            }
        }*/

        return sb.toString();
    }
}

//

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}