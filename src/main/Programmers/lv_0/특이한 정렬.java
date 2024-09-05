import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        //
        /*for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                int b = (numlist[j] - n) * (numlist[j] > n ? 1 : -1);
                if (a > b || (a == b && numlist[i] < numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }*/

        return numlist;
    }

    //
    /*class Number implements Comparable<Number> {
        int n;
        int target;
        Number(int n , int target) {
            this.n = n;
            this.target = target;
        }
        public int compareTo(Number other) {
            if (Math.abs(target - n) == Math.abs(target - other.n)) {
                return other.n - n;
            }
            return Math.abs(target - n) - Math.abs(target - other.n);
        }
    }
    public int[] solution(int[] numlist, int n) {
        Number[] numbers = new Number[numlist.length];
        for (int i = 0; i < numlist.length; ++i) {
            numbers[i] = new Number(numlist[i], n);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numlist.length; ++i) {
            numlist[i] = numbers[i].n;
        }
        return numlist;
    }*/
}

//

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}