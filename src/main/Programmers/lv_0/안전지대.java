class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        int [][] newBoard = new int[len + 2][len + 2];

        for (int x = 0; x < len; x++) {
            for (int y = 0; y < len; y++) {
                if (board[y][x] == 1) {
                    newBoard[y + 1][x + 1] = 1;
                }
            }
        }

        for (int y = 0; y < len; y++) {
            for (int x =0; x < len; x++) {
                if (board[y][x] == 1) {
                    newBoard[y][x] = 2;
                    newBoard[y][x+1] = 2;
                    newBoard[y][x+2] = 2;

                    newBoard[y+1][x] = 2;
                    newBoard[y+1][x+1] = 2;
                    newBoard[y+1][x+2] = 2;

                    newBoard[y+2][x] = 2;
                    newBoard[y+2][x+1] = 2;
                    newBoard[y+2][x+2] = 2;
                }
            }
        }

        for (int y = 1; y < len + 1; y++) {
            for (int x = 1; x <len + 1; x++) {
                if (newBoard[y][x] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}