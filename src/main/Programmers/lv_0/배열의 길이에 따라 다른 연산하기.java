class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;

        if (len % 2 == 0) {
            for (int i = 1; i < len; i += 2) {
                arr[i] = arr[i] + n;
            }
        } else {
            for (int i = 0; i < len; i += 2) {
                arr[i] = arr[i] + n;
            }
        }

        return arr;

        //
        // idx = arr.length % 2 * -1 + 1; 하면 삼항연산자 안 써도 됨
        for (int idx = arr.length % 2 == 0 ? 1 : 0; idx <arr.length; idx += 2) {
            arr[idx] += n;
        }
        //
        for (int i = arr.length - 1; i >= 0; i-= 2) {
            arr[i] += n;
        }
        return arr;
    }
}

//

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0))
                .toArray();
        //
        IntStream.iterate((arr.length + 1) % 2, i -> i < arr.length, i -> i + 2)
                .forEach(i -> arr[i] += n);
        return arr;
    }
}