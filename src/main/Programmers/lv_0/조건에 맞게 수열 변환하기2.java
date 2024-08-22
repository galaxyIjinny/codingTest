//class Solution { 틀린 풀이
//    public int solution(int[] arr) {
//        int[] before = arr;
//        int[] after = oper(arr);
//        int answer = 0;
//
//        while (before != after) {
//            before = after;
//            after = oper(after);
//            answer++;
//        }
//
//        return answer;
//    }
//
//    public int[] oper(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 50 && arr[i] % 2 == 0) {
//                arr[i] = arr[i] / 2;
//            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
//                arr[i] = arr[i] * 2 + 1;
//            }
//        }
//        return arr;
//    }
//}

class Solution {
    public int solution(int[] arr) {
        int count = -1;
        int[] nextArr = new int[arr.length];

        while(!isEqual(arr, nextArr)) { // formatting 에 신경쓰기
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    nextArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    nextArr[i] = arr[i] * 2 + 1;
                }
            }
            count++;
            arr = nextArr;
            nextArr = new int[arr.length];
        }
        return count;
    }

    private boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

//
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();

        //
        /*int count = 0;
        while (true) {
            int[] copied = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < copied.length; i++) {
                if (copied[i] >= 50 && copied[i] % 2 == 0) {
                    copied[i] /= 2;
                } else if (copied[i] < 50 && copied[i] % 2 == 1) {
                    copied[i] = copied[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, copied)) {
                return count;
            }
            arr = copied;
            count++;
        }*/
    }

    private int cntAction(int n) {
        int cnt = 0;
        boolean flag = true;

        while (flag) { // 각 원소를 변화시키면 서 변화 없어질때까지 횟수가 가장 큰 값 찾기. 문제 역시 배열 변화 반복횟수 물어보기 때문
            if (n % 2 == 0 && 50 <= n) {
                n /= 2;
                cnt++;
            } else if (n % 2 == 1 && n < 50) {
                n *= 2;
                n += 1;
                cnt++;
            } else {
                flag = false;
            }
        }
        return cnt;
    }
}

class Solution {
    int[] array;

    public int solution(int[] arr) {
        int i = 0;
        array = arr;
        while (true) {
            int[] newArray = Arrays.stream(array)
                    .map(operand -> operand > 49 && operand % 2 == 0 ? operand / 2 : 50 > operand && operand % 2 == 1 ? operand * 2 + 1 : operand)
                    .toArray();

            if (Arrays.equals(array, newArray)) break;
            ((Runnable) () -> array = newArray).run();
            i++;
        }
        return i;
    }