class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for (String menu : order) {
            if (menu.contains("americano") || menu.contains("anything")) { // contains("latte") 로 바꿔도 됐을 듯
                answer += 4500;
            } else {
                answer += 5000;
            }
        }

        return answer;
    }
}