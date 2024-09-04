class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int count = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                answer[i][j] = count++; //n * i + j;
            }
            for (int j = i; j < n - i - 1; j++) {
                answer[j][n - i - 1] = count++;
            }
            for (int j = n - i - 1; j > i; j--) {
                answer[n - i - 1][j] = count++;
            }
            for (int j = n - i - 1; j > i; j--) {
                answer[j][i] = count++;
            }
        }

        if (answer[n / 2][n / 2] == 0) {
            answer[n / 2][n / 2] = count;
        }

        //
        /*int x = 0, y = 0;
        int dx[] = {0, 1, 0,- 1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (count <= n * n) {
            answer[x][y] = count++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; // 범위 밖으로 나갔을 때 방향 전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }*/
        //
        /*int start = 0;
        int end = n;
        while (count <= n * n) {
            for (int j = start; j < end; j++) {
                answer[start][j] = count++;
            }
            for (int i = start + 1; i < end; i++) {
                answer[i][end - 1] = count++;
            }
            for (int j = end - 2; j >= start; j--) {
                answer[end - 1][j] = count++;
            }
            for (int i = end - 2; i > start; i--) {
                answer[i][start] = count++;
            }
            start++;
            end--;
        }*/

        return answer;
    }
}