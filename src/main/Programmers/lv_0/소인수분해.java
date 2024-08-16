import java.util.*;

class Solution {
    public int[] solution(int n) {
        int prime = 2;

        Set<Integer> set = new HashSet<>();

        while (n > 1) { // n > 0 으로 했다가 시간초과. 디테일 주의하기
            if (n % prime == 0) {
                n /= prime;
                set.add(prime);
            } else {
                prime++;
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return answer;

        //
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
            return primeNumbers.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}