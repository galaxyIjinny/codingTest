class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                sb.append(my_string.charAt(num2));
            } else if (i == num2) {
                sb.append(my_string.charAt(num1));
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        //
        /*StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, temp);
        return String.valueOf(Sb);*/

        return sb.toString();

        //
        /*String answer = "":
        char[] ch = myString.toCharArray();
        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);
        answer = String.valueOf(ch);
        return answer;*/
    }
}

//

import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
        import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }