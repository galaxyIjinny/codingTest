// 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1000이다.
//둘째 줄에 정수 i가 주어진다. (1 <= i <=|S|)
// 출력
// S의 i번째 글자를 출력한다.
// 메모리 : 17724 KB , 시간 : 232 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int i = scanner.nextInt();

//        String[] a = scanner.next().split("");
//        System.out.println(a[i-1]);

        System.out.println(S.charAt(i-1));

        scanner.close();
    }
}
