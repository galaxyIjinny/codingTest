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