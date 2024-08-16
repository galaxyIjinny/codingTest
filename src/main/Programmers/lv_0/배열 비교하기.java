class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int size1 = arr1.length;
        int size2 = arr2.length;

        if (size1 > size2) answer = 1;
        else if (size2 > size1) answer = -1;
        else {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < size1; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if (sum1 > sum2) answer = 1;
            else if (sum2 > sum1) answer = -1;
            else answer = 0;
        }

        return answer;

        //
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if (answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        return answer;
    }
}