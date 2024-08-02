
class Solution {
    public int solution(int[] array) {
        int count = 0;

        for (int i : array) {
            for (int j = 1; j <= i; j *= 10) {
                if (i % (j * 10) / j == 7) count++;
            }
        }

        return count;
    }
}

//

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
        )
    }
}