class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String s : dic) {
            for (int i = 0; i < spell.length; i++) {
                if(s.contains(spell[i])) answer = 1;
                else {
                    answer = 2;
                    break;
                }
            }
            if (answer == 1) break;

            //
            /*boolean isRight = true;
            for (String spellS : spell) {
                if (s.indexOf(spellS) == -1) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                answer = 1;
                break;
            }*/
        }

        return answer;
    }
}

//

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic)
                .map(s -> s.chars()
                        .sorted()
                        .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining()))
                .collect(Collectors.toList())
                .contain(Arrays.stream(spell)
                        .sorted()
                        .collect(Collectors.joining())) ? 1 : 2;
    }