import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1; // 0 으로 초기화하면 index가 0 인 경우 검사 불가
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (start == -1 && arr[i] == 2)
                start = i;
            else if (start != -1 && end == -1 && arr[i] == 2)
                end = i;
            else if (end != -1 && arr[i] == 2)
                end = i;
        }

        if (start == -1) {
            return new int[] {-1};
        } else if (end == -1) {
            return new int[] {2};
        }

        int[] answer = new int[end - start + 1];
        answer = Arrays.copyOfRange(arr, start, end + 1);

        return answer;

        //
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            answer = newint[] { -1};
        } else {
            answer = Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if (idx.length == 0) return new int[]{-1};
        return InteStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
    }
}
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : Arrays.asList(-1);
    }