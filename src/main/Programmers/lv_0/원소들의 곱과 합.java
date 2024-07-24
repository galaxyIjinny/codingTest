class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiple = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multiple *= num_list[i];
        }
        //
        /*for (int i : num_list) {
            multiple *= i;
            sum += i;
        }*/
        //

        if (sum * sum > multiple) {
            return 1;
        } else {
            return 0;
        }
        // 삼항 연산자
        return Math.pow(sum, 2) > multiple ? 1 : 0;
    }
}

//
import java.util.Arrays;

class Solution {
    public int solution(int[] num_List) {
        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
        return product < sum*sum ? 1 : 0;

        //
        return (Arrays.stream(num_List).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(num_List).sum(), 2)) ? 1 : 0;
    }
}