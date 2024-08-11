class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3)
                answer++;
        }

        return answer;
    }
}

//

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(divisor(i)>=3){
                ++answer;
            }
        }

        //
        /*for(int i=4; i<n+1; i++){
            if(i%2==0) {
                answer++; // 4이상 짝수는 전부 합성수
                continue;
            }
            else{
                for(int k=3; k<i/2; k=k+2){
                    if(i%k==0){
                        answer++;
                        break;
                    }
                }
            }
        }*/

        return answer;
    }

    public int divisor(int k){
        int count = 0;
        int temp = (int)Math.sqrt(k);
        for(int i=1; i<=temp; i++){
            if(k%i==0){
                ++count;
                if(k/i!=i){
                    ++count;
                }
            }
        }
        return count;
    }
}


//

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> (int) IntStream.rangeClosed(1, i)
                        .filter(i2 -> i % i2 == 0)
                        .count() > 2)
                .count();
    }
}