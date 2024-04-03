// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
// 출력
// 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
// 메모리 : 17576 KB , 시간 : 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println(word.length());

        scanner.close();
    }
}
