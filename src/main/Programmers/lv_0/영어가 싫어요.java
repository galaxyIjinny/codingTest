import java.util.*;

class Solution {
    public long solution(String numbers) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (int i = 0; i < numbers.length(); i++) {
            sb.append(numbers.charAt(i));
            idx++;
            if (map.containsKey(sb.toString())) {
                answer.append(map.get(sb.toString()).toString());
                sb.delete(0, idx);
                idx = 0;
            }
        }

        return Long.parseLong(answer.toString());

        //
        private static final Map<String, Integer> CONTAINS = Map.of("zero", 0, "one", 1, "two", 2,"three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
        public long solution(String numbers) {
            StringBuilder answer = new StringBuilder();
            StringBuilder builder = new StringBuilder();
            for (String s : numbers.split("")) {
                builder.append(s);
                if (CONTAINS.containsKey(builder.toString())) {
                    answer.append(CONTAINS.get(builder.toString()));
                    builder = new StringBuilder();
                }
            }
            return Long.parseLong(answer.toString());
        }
        //
        private final Map<String, Integer> NUMBERS = Map.of(
                "zero", 0,
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4,
                "five", 5,
                "six", 6,
                "seven", 7,
                "eight", 8,
                "nine", 9);

        public long solution(String numbers) {
            return Long.parseLong(NUMBERS.keySet().stream()
                    .reduce(numbers, (before, current) -> before.replaceAll(current, String.valueOf(NUMBERS.get(current)))));
        }


        //
        //
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;

        //
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }
}