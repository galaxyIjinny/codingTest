import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max1 = numbers[numbers.length - 1];
        int max2 = numbers[numbers.length - 2];

        return max1 * max2;
    }
}

//
class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int prev = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                prev = max;
                max = numbers[i];
            } else if (prev < numbers[i]) {
                prev = numbers[i];
            }
        }

        reutrn prev*max;
    }
}

//

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        return numbers[0] * numbers[1];

        //
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2L)
                .reduce(1, Math::multiplyExact);
    }