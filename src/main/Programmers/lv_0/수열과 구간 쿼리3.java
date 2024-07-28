class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int front = queries[i][0];
            int back = queries[i][1];

            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;
        }
        //
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        //
        for(int i = 0; i < queries.length; i ++){
            int one = arr[queries[i][0]];
            int two = arr[queries[i][1]];

            arr[queries[i][0]] = j;
            arr[queries[i][1]] = i;
        }

        return arr;
    }
}