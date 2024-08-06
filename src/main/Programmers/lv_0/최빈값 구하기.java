class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
                list.add(i);
            }
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            int maxKey = 0;
            if (answer < map.get(list.get(i))) {
                answer = map.get(list.get(i));
                maxKey = list.get(i);
            }
            if (answer == map.get(list.add(i)) && maxKey != list.get(i)) {
                answer = -1;
                break;
            }
        }

        return answer;
        // 최빈값이 중복되는 경우 찾을 수 없어서 키를 리스트에 추가해서 최빈값의 키가 여러개인지 확인하려고 하다 실패

        //
        /*int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            }
            else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;*/
    }
}

//
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>();
        entries.sort((o1, o2) -> o2.getValue() - o1.getValue());

        if (entries.size() > 1) {
            if (entries.get(0).getValue() == entries.get(1).getValue()) return -1;
        }

        return entries.get(0).getKey();
    }
}
//

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int countMax = 0;
        int arrayMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }

        int[] arr = new int[arrayMax + 1];

        for (int j = 0; j < array.length; j++) {
            arr[array[j]]++;
        }

        for (int k = 0; k < arr.length; k++) {
            if (countMax < arr[k]) {
                countMax = arr[k];
                answer = k;
            }
        }

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == countMax) {
                count++;
            }
        }

        if (count > 1) return -1;
        else return answer;
    }
}

//

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet()).stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size())).collect(Collectors.toList());
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }
}