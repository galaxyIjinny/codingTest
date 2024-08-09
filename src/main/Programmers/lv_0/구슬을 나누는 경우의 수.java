class Solution {
    public int solution(int balls, int share) {
        // 다수의 경우 실패
        int answer = 1;
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
        }
        for (int i = 0; i < share; i++) {
            answer /= (share - i);
        }
        return answer;

        //
        /*share = Math.min(balls - share, share);
        if (share == 0) return 1;
        long result = solution(balls - 1, share - 1);  // return solution(balls - 1, share - 1) * balls / share;
        result *= balls;
        result /= share;
        return result;*/


        // 곱 때문에 long타입을 통해 값을 크게 저장할 필요
        /*long answer = 1;

        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return (int) answer;*/
    }
}

//
import java.math.*;
class Solution {
    public BigInteger solution(int balls, int share) {
        return factor(balls).divide(factor(balls - share).multiply(factor(share)));
    }
    public BigInteger factor(int num) {
        BigInteger ret = new BigInteger("1");
        BigInteger from = new BigInteger("1");
        BigInteger to = new BigInteger(String.valueOf(num));
        for(BigInteger i = from; i.compareTo(to) <= 0; i = i.add(BigInteger.ONE))
            ret = ret.multiply(o);
        return ret;
    }

    //
    /*public long solution(int balls, int share) {
        return getFactorial(balls, balls - share).divide(new BigInteger(String.valueOf(getFactorial(share)))).longValue();
    }

    private BigInteger getFactorial(int n, int m) {
        BigInteger result = new BigInteger(String.valueOf(n));

        for (int i = n - 1; i > m; i--) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }

        return result;
    }

    private int getFactorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }*/
}