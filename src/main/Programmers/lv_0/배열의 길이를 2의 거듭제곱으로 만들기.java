class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (Math.pow(2, i) >= len) {
                answer = new int[(int) Math.pow(2, i)];
                break;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (i < len) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
            // answer[i] = arr[i]; 생각해보니 조건 안 달아도 됐었다...
        }

        return answer;
    }

    //
    public int[] twoDouble = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    public int[] solution(int[] arr) {
        if (isDouble(arr.length)) return arr;

        int N = getNewLen(arr.length);
        int[] answr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
    public int getNewLen(int len) {
        for (int i = 0; i < twoDouble.length; i++)
            if (len < twoDouble[i])
                return twoDouble[i];
        return -1;
    }
    public boolean isDouble(int len) {
        for (int twoData : twoDouble)
            if (twoData == len)
                return true;
        return false;
    }
}

//

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        while (length < arr.length) {
            length *= 2;
        }
        return Arrays.copyOf(arr, length);
        //return Arrays.copyOf(arr, (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2))));

        //
        /*int siz = (int) Math.pow(2, Integer.toBinaryString(arr.length).length());
        if (arr.length == siz / 2) return arr;
        return IntStream.range(0, siz)
                map(i -> i < arr.length ? arr[i] : 0)
                        .toArray();*/
    }
}