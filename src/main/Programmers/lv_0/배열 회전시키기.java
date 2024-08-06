class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];

        if (direction.equals("right")) {
            answer[0] = numbers[len - 1];
            for (int i = len - 1; i > 0; i--) {
                answer[i] = numbers[i - 1];
            }
        } else {
            answer[len - 1] = numbers[0];
            for (int i = 0; i < len - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        }

        /*int direct = "right".equals(direction) ? 1 : -1;

        for (int i = 0; i < length; i++) {
            answer[i] = numbers[(i - direct + len) % len]; // -1 방지
        }*/

        return answer;
    }
}

//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(),list.get(1));
            list.remove(0);
        }

        return list.stream.mapToInt(Integer::intValue).toArray();
    }
}