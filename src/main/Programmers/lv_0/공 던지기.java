class Solution {
    public int solution(int[] numbers, int k) {
        return (2 * (k - 1) + 1) % numbers.length; // 일부 테스트 케이스 통과 못함
        //return (k-1)*2 % numbers.length+1; // 정답 처리
        //return numbers[((k-1)*2)%numbers.length];
    }

    //
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        if (order(k) % len == 0) return len;
        else return order(k) % len;

    }

    public int order (int x) {
        return (2 * (x - 1) + 1);
    }
}

//

import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        Queue<Integer> queue = newLinkedList<>();
        for (int num : numbers) queue.add(num);

        int cnt = 1;
        while(cnt != k) {
            queue.add(queue.poll());
            queue.add(queue.poll());
            cnt++;
        }
        answer = queue.poll();
        return answer;
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers, int k) {
        return IntStream.range(1, k).mapToObj(i -> numbers).flatMapToInt(IntStream::of).toArray()[2 * k - 2];
    }
}