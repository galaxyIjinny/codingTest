class Solution {
    public String solution(String letter) {
        String[] morse = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : morse) {
            switch(s) {
                case ".-" :
                    sb.append("a");
                    break;
                case "-..." :
                    sb.append("b");
                    break;
                case "-.-." :
                    sb.append("c");
                    break;
                case "-.." :
                    sb.append("d");
                    break;
                case "." :
                    sb.append("e");
                    break;
                case "..-." :
                    sb.append("f");
                    break;
                case "--." :
                    sb.append("g");
                    break;
                case "...." :
                    sb.append("h");
                    break;
                case ".." :
                    sb.append("i");
                    break;
                case ".---" :
                    sb.append("j");
                    break;
                case "-.-" :
                    sb.append("k");
                    break;
                case ".-.." :
                    sb.append("l");
                    break;
                case "--" :
                    sb.append("m");
                    break;
                case "-." :
                    sb.append("n");
                    break;
                case "---" :
                    sb.append("o");
                    break;
                case ".--." :
                    sb.append("p");
                    break;
                case "--.-" :
                    sb.append("q");
                    break;
                case ".-." :
                    sb.append("r");
                    break;
                case "..." :
                    sb.append("s");
                    break;
                case "-" :
                    sb.append("t");
                    break;
                case "..-" :
                    sb.append("u");
                    break;
                case "...-" :
                    sb.append("v");
                    break;
                case ".--" :
                    sb.append("w");
                    break;
                case "-..-" :
                    sb.append("x");
                    break;
                case "-.--" :
                    sb.append("y");
                    break;
                case "--.." :
                    sb.append("z");
                    break;
            }
        }

        return sb.toString();

        //
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        /*Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < mose.length; i++) map.put(morse[i], (char) (97 + i));
        for (String x : word) answer += map.get(x);*/


        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97);
            }
        }

        return answer;
    }
}

//

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> morse = new HashMap<>(){
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String[] letters = letter.split(" ");
        for(String str : letters){
            sb.append(morse.get(str));
        }
        return sb.toString();
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    Map<String, String> dictionary = new HashMap<>() {{
        put(".-", "a");
        put("-...", "b");
        put("-.-.", "c");
        put("-..", "d");
        put(".", "e");
        put("..-.", "f");
        put("--.", "g");
        put("....", "h");
        put("..", "i");
        put(".---", "j");
        put("-.-", "k");
        put(".-..", "l");
        put("--", "m");
        put("-.", "n");
        put("---", "o");
        put(".--.", "p");
        put("--.-", "q");
        put(".-.", "r");
        put("...", "s");
        put("-", "t");
        put("..-", "u");
        put("...-", "v");
        put(".--", "w");
        put("-..-", "x");
        put("-.--", "y");
        put("--..", "z");
    }};

    public String solution(String letter) {
        return Arrays.stream(letter.split(" "))
                .map(dictionary::get)
                .collect(Collectors.joining());
    }
}