class Solution {
    public int[] solution(int num, int total) {
        // 테스트케이스 7 실패
        int[] answer = new int[num];

        int before = total - (((num - 1) * (num - 2)) / 2);
        int start = 0;
        if (before > 0) {
            start = before / num;
        } else {
            start = (before - num) / num;
        }

        for (int i = 0; i < num; i++) {
            answer[i] = i + start;
        }
        return answer;

        //
        int start = (total * 2 / num - num + 1) / 2;
        for(int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        //
        int check = num * (num + 1) / 2;
        int start = (total - check) / num + 1;


    }
}