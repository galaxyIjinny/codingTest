// 메모리 : 17576 KB , 시간 : 204 ms

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int king =1, queen = 1;
        int rook = 2, bishop = 2, knight = 2;
        int pawn = 8;

        king = king - scanner.nextInt();
        queen = queen - scanner.nextInt();
        rook = rook - scanner.nextInt();
        bishop = bishop - scanner.nextInt();
        knight = knight - scanner.nextInt();
        pawn = pawn - scanner.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn + " ");
        scanner.close();
    }
}

/* 코드 검토
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chess[] = new int[6];
        for (int i = 0; i < 6; i++) {
            chess[i] = scanner.nextInt();
        }

        int find[] = new int[6];
        for (int i = 0; i < 6; i++) {
            if (i == 0 || i == 1) {
                find[i] = 1 - chess[i];
            }
            if (i == 2 || i == 3 || i == 4) {
                find[i] = 2 - chess[i];
            }
            if (i == 6) {
                find[i] = 8 - chess[i];
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(find[i] + " ");
        }
        scanner.close();
    }
}
*/
