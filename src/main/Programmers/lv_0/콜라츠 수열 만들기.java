import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();

        // i 가 1 일 때 0으로 보내서 종결시키기
        return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : 3 * i + 1).mapToInt(Integer::intValue).toArray();

    }
}

import java.util.LinkedList;
        import java.util.Queue;

class Solution {
    public int[] solution(int n) {
        Queue<Integer> answer = new LinkedList<>();
        while (n > 1) {
            answer.add(n);
            if (n % 2 == 0) n >>= 1;
            else n = n * 3 + 1;
        }
        answer.add(1);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}