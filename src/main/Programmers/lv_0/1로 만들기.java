class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int num : num_list) {
            while (num > 1) {
                answer++;
                if (num % 2 == 0) {
                    num /= 2;
                } else { // int 타입이라 - 1 안해도 됨
                    num = (num - 1) / 2;
                }
            }
        }

        //
/*        int a = 0;
        for (int i = 0; i < num_list.length; i++) {
            int j = 0;
            while (num_list[i] >= Math.pow(2, j)) {
                a = j;
                j++;
            }
            answer += a;
        }*/

        return answer;
    }
}

//

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
                .map(i -> Integer.toBinaryString(i).length() - 1)
                .sum();
        //
        return Arrays.stream(num_list)
                .map(num -> {
                    int count = 0;

                    while (num != 1) {
                        num = (num % 2 == 0) ? num / 2 : (num - 1) / 2;
                        count++;
                    }

                    return count;
                })
                .sum();
    }
}