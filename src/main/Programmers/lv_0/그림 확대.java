class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : picture[i].toCharArray()) {
                int strRepeat = 0;
                while (strRepeat < k) {
                    sb.append(c);
                    strRepeat++;
                    //
                    sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
                }
            }

            for (int j = 0; j < k; j++) {
                answer[k * i + j] = sb.toString();
            }
        }

        return answer;
    }
}

//

import static java.lang.String.valueOf;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.IntStream.range;

class Solution {
    public String[] solution(String[] picture, int k) {
        return range(0, picture.length * k).mapToObj(i -> range(0, picture[i / k].length())
                .mapToObj(l -> valueOf(picture[i / k].charAt(l))
                        .repeat(k))
                .collect(joining()))
                .toArray(String[]::new);
    }