import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        double[] compare = new double[len];
        double[] avg = new double[len];
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
            compare[i] = avg[i];
        }

        Arrays.sort(avg);

        for (int i = 0; i < len; i++) {
            int grade = 1;
            for (int j = 0; j < len; j++) {
                if (compare[i] < avg[j]) {
                    grade++;
                }
            }
            answer[i] = grade;
        }

        //
        /*List<Integer> scoreList = new ArrayList<>();
        for (int[] t : score) {
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = newint[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }*/

        return answer;
    }
}

//

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[][] score) {
        return Arrays.stream(score).
                .map(ints -> Arrays.stream(ints)
                .average()
                .orElse(0))
                .mapToInt(d -> Arrays.stream(score)
                        .map(ints -> Arrays.stream(ints)
                                .average()
                                .orElse(0))
                        .sorted(Comparator.reverseOrder()
                                .collect(Collectors.toList())
                                .indexOf(d) + 1))
                .toArray();
    }
}