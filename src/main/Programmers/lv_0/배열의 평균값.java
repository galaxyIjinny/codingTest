class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        double avg = sum / numbers.length;

        return avg;

        /*int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        double answer = sum/(double)numbers.length;*/
    }
}

//

import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}