class Solution {
    public int solution(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        return (int) (result * 1000);
    }
}

// 정수 부분만 리턴이니까

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        return num1 * 1000 / num2;
    }
}