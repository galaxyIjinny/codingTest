class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

//

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char str = myString.charAt(i);
            sb.append(Character.toUpperCase(str));
        }

        return sb.toString();
    }
}

//

class Solution {
    public String solution(String myString) {
        String answer = "";

        for(int i = 0 ; i < myString.length() ; i++) {
            char temp = myString.charAt(i);
            if (temp >= 97) {
                temp -= 32;
            }
            answer += String.valueOf(temp);
        }
        return answer;
    }
}