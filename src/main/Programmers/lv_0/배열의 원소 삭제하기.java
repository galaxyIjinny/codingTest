import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        boolean flag = true;
        for (int a : arr) {
            for (int d : delete_list) {
                if (a == d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(a);
            } else {
                flag = true;
            }
        }

        //
        /*for (int n : arr) {
            list.add(n);
        }
        for (int n : delete_list) {
            list.remove((Integer) n);
        }*/

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

        //
        HashSet<Integer> delete = new HashSet<>();
        for (int del : delete_list)
            delete.add(del);
        return Arrays.stream(arr).filter(i -> !delete.contains(i)).toArray();
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr)
                .filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))
                .toArray();
    }
}