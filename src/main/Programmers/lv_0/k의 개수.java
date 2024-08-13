class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int n = i; n <= j; n++) {
            String[] arrN = String.valueOf(n).split("");
            for (String s : arrN) {
                if (s.equals(String.valueOf(k)))
                    answer++;
            }
            //
            /*String str = n + "";
            for (int l = 0; l < str.length(); l++) {
                if (str.charAt(l) - '0' == k)
                    answer++;
            }*/

            //
            /*int tmp = n;
            while (tmp != 0) {
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }*/
        }

        return answer;

        //
        String str = "";
        for (int a = i; a <= j; a++) {
            str += a + "";
        }
        return str.length() - str.replace(k + "", "").length();
    }
}

//
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
                        .flatMap(String::lines)
                        .collect(Collectors.joining())
                        .split(""))
                .filter(s -> s.equals(String.valueOf(k)))
                .count();
    }

    //
    public int solution(int i, int j, int k) {
        int count = 0;

        for (int num = i; num <= j; num++) {
            count += (int) Arrays.stream(String.valueOf(num).split(""))
                    .filter(n -> n.equals(String.valueOf(k)))
                    .count();
        }

        return count;
    }
}