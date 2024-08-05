class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 6 * n; i++) { // 방정식 적은 후 값 구하듯이 풀이했다. 그런데 값 구하는 조건을 잘 생각해서 이항해야 할 듯
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        /*int answer = 1;
        while (true) {
            if (6 * answer % n == 0) break;
            answer++;
        }*/
        return answer;
    }
}

//

class Solution {
    public int solution(int n) { // 함수 실행 순서대로
        return LCM (n, 6) / 6;
    }

    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }

    publicint GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return GCD(num2, num1 % num2);
    }
}