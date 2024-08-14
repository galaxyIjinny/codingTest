class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')
                sb.append(String.valueOf(my_string.charAt(i)).toLowerCase());
            //sb.append(my_string.charAt(i) - 32); 이런 형식은 안됨
            else if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z')
                sb.append(String.valueOf(my_string.charAt(i)).toUpperCase());
        }

        //
        //if (Character.isUpperCase(my_string.charAt(i))
        /*for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                answer += (char)(s.charAt(i)-32);
            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                answer += (char)(s.charAt(i)+32);
            } else {
                answer += s.charAt(i);
            }
        }*/
        return sb.toString();
    }
}

//

import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars()
                .mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ?
                        Character.toUpperCase(operand) : Character.toLowerCase(operand))))
                .collect(Collectors.joining());
    }