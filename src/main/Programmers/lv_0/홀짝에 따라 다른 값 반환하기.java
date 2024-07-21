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
import java.util.stream.IntStream; // 반복문을 간결하게 처리하는 라이브러리

class Solution {
    public int solution(int n) {
        if (n % 2 == 0) {
            return IntStream.rangeClosed(1, n) // range()는 종료값 포함 x, rangeClosed()는 종료값 포함
                    .filter(i->i%2 == 0) // 스트림 내 요소 필터링
                    .map(i->(int) Math.pow(i,2))
                    .sum();
        } else {
            return IntStream.rangeClosed(1, n)
                    .filter(i->i%2 == 1)
                    .sum();
        }
        // forEach(System.out::println) 도출값 출력하는 람다 표현식
    }
}