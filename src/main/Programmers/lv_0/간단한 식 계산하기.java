class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.valueOf(arr[0]);
        String operator = arr[1];
        int b = Integer.valueOf(arr[2]);

        int answer = 0;

        switch (operator) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            /*default:
                throw new IllegalArgumentException("Invalid operator: " + op);*/
        }

        return answer;
    }
}