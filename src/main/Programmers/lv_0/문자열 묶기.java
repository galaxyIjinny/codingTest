import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            int len = str.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
            answer = Math.max(answer, map.get(len));
        }
        //
        /*int[] lengArr = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            lengArr[strArr[i].length()]++;
            answer = Math.max(answer, lengArr[i]);
        }
        //return Arrays.stream(counter).max().getAsInt();
        */


        //
        /*Map<Integer, ArrayList<String>> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length;
            if (map.containsKey(len)) {
                map.get(len).add(str);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(len, temp);
            }
        }
        int answer = 0;
        for (int len : map.keySet())
            answer = Math.max(answer, map.get(len).size());
            //
            for (Map.Entry <Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() > max)
                    max = entry.getValue();
                { //
            */

        return answer;
    }
}

//

import java.util.*;
        import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr)
                .collect(Collectors.groupingBy(String::length))
                .values()
                .stream()
                .max(Comparator.comparingInt(List::size))
                .orElse(Collections.emptyList())
                .size();
    }
}