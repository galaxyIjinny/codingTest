class Solution {
    public int solution(int n) {
        int answer = 0;

        int idx = 0;
        int three = n;
        for (int i = 1; i <= three; i++) { // 조건 잘 확인하기, 3포함은 100마만일 때 말고도 고려해서 문자열로 확인
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                idx++;
                three++;
            }
            //
            /*answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3"))
                i--;*/
        }

        return n + idx;
    }
}

