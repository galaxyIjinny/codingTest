class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int distance = n - array[0];

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[i]) < distance) {
                if (n - array[i] < answer) { // 거리가 같으면 상위 조건문에서 통과되므로 아래로 이동해야함
                    answer = array[i];
                    distance = n - array[i];
                }
            }
        }
        // 다음으로 수정
        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(n - array[i]);
            if (abs < distance) {
                answer = array[i];
                distance = abs;
            } else if (answer > array[i] && abs == distance) {
                answer = array[i];
            }
        }

        return answer;

        // 정렬 후 index 0에 최소 차이값을 저장 반복
        /*Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;*/
    }
}

//
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        Math.min(array[Arrays.stream(array)
                        .map(operand -> Math.abs(n - operand))
                        .boxed()
                        .collect(Collectors.toList())
                        .indexOf(Arrays.stream(array)
                                .map(operand -> Math.abs(n - operand))
                                .min()
                                .orElse(0))],
                array[Arrays.stream(array)
                        .map(operand -> Math.abs(n - operand))
                        .boxed()
                        .collect(Collectors.toList())
                        .lastIndexOf(Arrays.stream(array)
                                .map(operand -> Math.abs(n - operand))
                                .min()
                                .orElse(0))]);
    }
}