// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
// 입력
// 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
// 출력
// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
// 메모리 : 17684 KB , 시간 : 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int[9];

        for (int i = 0; i < 9; i++) {
            n[i] = scanner.nextInt();
        }

        int max = 0;  // max = n[0]; 는 한 줄 씩 입력 받기 때문에 틀린 듯??
        int count = 0;

        for (int j = 0; j < 9; j++) {
            if (max < n[j]) {
                max = n[j];
                count = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);
        scanner.close();
    }
}
