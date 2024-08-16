class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] cul = quiz[i].split(" ");
            if (cul[1].equals("+")) {
                int result = Integer.parseInt(cul[0]) + Integer.parseInt(cul[2]);
                if (result == Integer.parseInt(cul[4])) {
                    answer[i] = "O";
                    System.out.println("O");
                } else {
                    answer[i] = "X";
                }
            } else if (cul[1].equals("-")) {
                int result = Integer.parseInt(cul[0]) - Integer.parseInt(cul[2]);
                if (result == Integer.parseInt(cul[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else break;
        }

        return answer;

        //
        for (int i = 0; i < quiz.length; i++) {
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * (text[1].equals("+") ? 1 : -1) );
            quiz[i] = result == Integer.parseInt(text[4]) ? "O" : "X";
        }
        return quiz;
    }
}

//

import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(s -> {
            String[] arr = s.trim().split(" ");
            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }).toArray(String[]::new);
    }