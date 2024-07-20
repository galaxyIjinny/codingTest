class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
        }
        return sum;
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        if (n % 2 == 0) {
            return IntStream.rangeClosed(1, n)
                    .filter(i->i%2 == 0)
                    .map(i->(int) Math.pow(i,2))
                    .sum();
        } else {
            return IntStream.rangeClosed(1, n)
                    .filter(i->i%2 == 1)
                    .sum();
        }
    }
}