// 130544 KB , 1456 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}


// 335504 KB , 2760 ms

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);  // Timesort = 합병 및 삽입정렬 알고리즘(두 가지가 섞인 hybrid sorting algorithm)
        // 합병(

        StringBuilder sb = new StringBuilder();
        for (int value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);

        /*for (int i = 0; i < N; i++) { // 이 경우에도 시간 초과
            System.out.println(list.get(i));
        }*/

        scanner.close();
    }
}

// Arrays.sort() 는 dual-pivot Quicksort 알고리즘 사용. 평균 O(nlog n) 이지만 최악의 경우 O(n^2)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num); //

        for (int i = 0; i < N; i++) {
            System.out.println(num[i]);
        }

        scanner.close();
    }
}
