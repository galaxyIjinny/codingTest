class Solution {
    public int solution(int M, int N) {
        int answer = 0;

        if (M == 1)
            answer = N - 1;
        else if (N == 1)
            answer = M - 1;
        else {
            answer += (N - 1) * M + (M - 1);
        }

        return answer;
        // M * N - 1;

        //
        /*int[][] dp = new int[101][101];
        for (int i = 2; i < dp.length; i++) {
            dp[1][i] = dp[i][1] = i - 1;
        }
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                dp[i][j] = dp[1][j] + dp[i - 1][j] + 1;
            }
        }

        return dp[M][N];*/
    }
}