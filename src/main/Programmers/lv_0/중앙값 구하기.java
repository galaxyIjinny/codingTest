import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
        //return array[array.length >> 1];
    }
}
