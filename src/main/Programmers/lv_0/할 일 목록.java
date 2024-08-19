class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                idx++;
            }
        }

        String[] answer = new String[idx];
        idx = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;

        //
        /*String str = "";
        for (int i = 0; i < finished.length; i++) {
            str = finished[i] == false ? str + todo_list[i] + "," : str;
        }
        return str.split(",");*/
    }
}

//

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todoList, boolean[] finished) {
        return IntStream.range(0, todoList.length)
                .maptToObj(i -> new AbstractMap.SimpleEntry<>(todoList[i], !finished[i]))
                .filter(AbstractMap.SimpleEntry::getValue)
                .map(AbstractMap.SimpleEntry::getKey)
                .toArray(String[]::new);
        //
        return IntStream.range(0, finished.length).filter(i -> !finished[i]).mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }
}