class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a","")
                .replace("e","")
                .replace("i","")
                .replace("o","")
                .replace("u","");
        return new StringBuilder(answer).toString();
        // answer = my_string.replaceAll("[aeiou]",""); // 정규표현식 사용
        // return myString.replaceAll("a|e|i|o|u","");
    }
}