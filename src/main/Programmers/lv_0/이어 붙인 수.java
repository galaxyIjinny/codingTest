class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 == 0) {
                even.append(String.valueOf(i));
            } else {
                odd.append(String.valueOf(i));
            }
            // 한줄로
            //(num % 2 == 0 ? a : b).append(num);
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());

        //
        int answer = 0;

        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;

        return answer;
    }
}

//
import java.util.Arrays;
        import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddStr = Arrays.stream(num_list)
                .filter(x -> x % 2 != 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        String evenStr = Arrays.stream(num_list)
                .filter(x -> x % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        int oddNumber = oddStr.isEmpty() ? 0 : Integer.parseInt(oddStr);
        int evenNumber = evenStr.isEmpty() ? 0 : Integer.parseInt(evenStr);

        answer = oddNumber + evenNumber;

        return answer;

        // ==
        return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));

    }
}