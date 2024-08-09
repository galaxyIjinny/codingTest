class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - 1)/ n + 1];
        /*Double length = Math.ceil(num_list.length/(n*1.0));
        int[] answer = newint[length.intValue()];*/

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}