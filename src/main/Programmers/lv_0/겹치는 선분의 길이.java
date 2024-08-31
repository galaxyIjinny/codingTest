class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] count = new int[201];

        for (int[] i : lines) {
            int start = i[0] + 100;
            int end = i[1] + 100;

            for (int k = start; k < end; k++) {
                count[k]++;
            }
        }

        for (int i : count) {
            if (i > 1) answer++;
        }

        return answer;

        //
        for (int i = -100; i < 100; i++) {
            int line = 0;
            if (lines[0][0] <= i && lines[0][1] > i) line++;
            if (lines[1][0] <= i && lines[1][1] > i) line++;
            if (lines[2][0] <= i && lines[2][1] > i) line++;

            if (line > 1) answer++;
        }
        return answer;
    }
}

//
import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int from = Math.min(line[0], line[1]);
            int to = Math.max(line[0], line[1]);
            for (int i = from; i < to; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }

        return (int) map.values().stream().filter(i -> i > 1).count();
        //
        /*for (int i = 0; i < lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);

            for (int j=min; j<max; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }
        return answer;*/
    }
}

// 생각지 못한 방식.....
/*
import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] start = new int[3];
        int[] end = new int[3];

        for (int i = 0; i < 3; i++) {
            start[i] = lines[i][0];
            end[i] = lines[i][1];  // 이렇게 정렬하면 연결점을 못찾을 것 같다. 반례가 더 많아짐
        }

        Arrays.sort(start);
        Arrays.sort(end);

        if (start[1] < end[0]) {
            if (start[2] < end[0]) {
                answer += end[0] - start[2];
            } else {
                answer += end[0] - start[1];
            }
        }

        if (start[2] < end[1]) {
            if (start[2] < end[0]) {
                answer += end[0] - start[2];
            } else {
                answer += end[1] - start[2];
            }
        }

        if (start[2] < end[1]) {
            if (start[2] < end[0]) {
                answer += end[0] - start[2];
            } else {
                answer += end[1] - start[2];
            }
        }

        //
        Arrays.sort(lines, (a, b) -> Integer.compare(a[0], b[0]));

        if (lines[0][1] < lines[1][0]) {
            if (lines[2][1] < lines[0][1]) {
                answer = lines[0][1] - lines[1][0];
            }
            if (lines[2][0] < lines[1][1]) {
                answer += lines[1][1] - lines[2][0];
            }
        } else if (lines[1][0] >= lines[0][1]) {
            if (lines[2][0] < lines[1][1]) {
                answer = lines[1][1] - lines[2][0];
            }
        } else {
            if (lines[1][1] <= lines[2][0]) {
                answer += lines[1][1] - lines[1][0];
                answer += lines[2][1] - lines[2][0];
            } else {
                if (lines[2][0] <= lines[1][1]) {
                    answer = lines[1][1] - lines[1][0];
                    answer += lines[2][1] - lines[2][0];
                } else {
                    if (lines[2][1] >= lines[1][1]) {
                        answer = lines[2][1] - lines[1][0];
                    } else {
                        answer = lines[1][1] -lines[1][0];
                    }
                }
            }
        }

        return answer;
    }
}*/