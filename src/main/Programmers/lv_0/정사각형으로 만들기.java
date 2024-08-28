class Solution {
    public int[][] solution(int[][] arr) { // 조건을 너무 고려했던 것 같다...
        int row = arr.length;
        int col = arr[0].length;
        int max = row > col ? row : col;
        int[][] answer = new int[max][max];

        for (int i = 0; i < row; i++) {
            if (row > col) {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr[i][j];
                }
                for (int j = col; j < row; j++) {
                    answer[i][j] = 0;
                }
            }

            else if (row < col) {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr[i][j];
                }
            }

            else {
                for (int j = 0; j < col; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }

        return answer;
    }
}

//

class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        //
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                array[i][j] = arr[i][j];
            }
        }*/

        return array;
    }
}