class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        System.arraycopy(num_list, n - 1, answer, 0, num_list.length - n + 1);
        return answer;
        // Arrays.copyOfRange(num_list, n-1, num_list.length);
        //
        /*for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;*/
    }
}