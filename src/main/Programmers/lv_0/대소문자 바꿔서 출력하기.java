import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 97) { // 소문자일 경우
                sb.append((char)(c - 32));
            } else if (c >= 65 && c < 97) {
                sb.append((char)(c + 32));
            }
        }
        System.out.print(sb.toString());

        //
        for (Character c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb.toString());
    }
}