class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            s = s.replaceAll("aya", ""); // s.replace() 아닌 s = s.replace까지
            s = s.replaceAll("ye", ""); // 근데 이러면 공백 때문에 다른 문자가 겹쳐져서 바꾸면 안될 것도 바뀜
            s = s.replaceAll("woo", ""); // babbling[i] = babbling[i].replace("ma", "1");
            s = s.replaceAll("ma", ""); // babbling[i] = babbling[i].replace("1", ""); 이런 식으로 바꿔야 제대로 카운트
            System.out.println(s);
            if (s.equals("")) answer++;
        }

        //
        /*String[] bal = {"aya", "ye", "woo", "ma"};
        String tmp = "";

        for (String i : babbling) {
            for (String j : bal) {
                tmp = i.replace(j, " ");
                i = tmp;
            }
            if (i.isBlank()) answer++;
        }*/

        // 정규표현식
        /*for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }*/

        return answer;
    }
}

//
import java.util.Arrays;

public class Solution {

    final String[] WORD = { "aya", "ye", "woo", "ma" };

    public int solution(String[] param) {
        return (int) Arrays.stream(param).filter(i -> checkWord(replaceWord(i))).count();
    }

    String replaceWord(String param) {
        for (int i = 0; i < 4; i++) {
            param = param.replace(WORD[i], Integer.toString(i));
        }

        return param;
    }

    boolean checkWord(String param) {
        if (param.replaceAll("[0-3]", "").length() == 0) {
            char target = param.charAt(0);

            for (int i = 1; i < param.length(); i++) {
                if (target == param.charAt(i)) {
                    return false;
                } else {
                    target = param.charAt(i);
                }
            }

            return true;
        }
        return false;
    }

}