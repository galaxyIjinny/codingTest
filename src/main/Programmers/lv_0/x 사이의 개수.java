import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        list.add(sb.toString());

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++ ) {
            answer[i] = list.get(i).length();
        }

        //
        /*ArrayList<Integer> list = new ArrayList<>();
        String[] tmp = myString.split("x");
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i].length());
        }
        if (myString.endsWith("x")) {
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(o);
        }*/

        //
        /*String[] str = myString.split("x", -1);
        int[] answer = new int[str.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();
        }*/

        return answer;

        //
        myString += "x";
        ArrayList<Integer> arr = new ArraLitst<>();
        for (int i = 0, cnt = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                cnt++;
            } else {
                arr.add(cnt);
                cnt = 0;
            }
        }
        return arr.stream().mapToInt(Intger::intValue).toArray();
    }
}

//

import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(x -> x.length())
                .toArray();
        //
        return Arrays.stream(myString.split("x", -1))
                .map(String::length)
                .toAArray();
    }