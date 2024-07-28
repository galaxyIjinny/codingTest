import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            String[] nums = num.split("");
            int numLength = nums.length;
            int count = 0;

            for (int j = 0; j < numLength; j++) {
                if (nums[j].equals("0") || nums[j].equals("5")) {
                    count++;
                }

                if (count == numLength) {
                    list.add(i);
                }
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if (answer.length == 0) {
            answer = new int[] { -1 };
        }
        return answer;
    }
}

// 이진법 활용
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}

import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // 이진법 활용
        // l = 5, r = 555
        // 5,   50,   55,   500,   505,   550,   555
        // 1    10    11    100    101    110    111
        // 1     2     3      4      5      6      7

        // 지수는 자릿수
        // 2^0 <= x < 2^3
        int digit = String.valueOf(r).length();
        int exponent = (int)Math.pow(2.0, digit);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < exponent; i++) {
            String binaryString = Integer.toBinaryString(i);
            int target = Integer.parseInt(binaryString) * 5;
            if (target >= l && target <= r)
                list.add(target);
        }

        if (list.isEmpty())
            return new int[] {-1};
        else
            return list.stream().mapToInt(i -> i).toArray();
    }
}

//
import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        loop :
        for (int i = l; i <= r; i++) {
            int j = i;
            while(j != 0) {
                if (j % 5 != 0) {
                    continue loop;
                }

                j /= 10;
            }

            list.add(i);
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
}

//
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r).filter(i -> {
            while (i > 0) {
                if (i % 5 != 0) return false;
                i /= 10;
            }
            return true;
        }).toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}



// list 배열로 바꾸는 법. 문자로 안 바꾸고 하려다 보니 자릿수가 증가할 때마다 조건을 추가해야 했다.
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if ((i % 5 == 0) && ((i / 5) % 10 == 1) && (i * 10)) {
                list.add(i);
            } else if ((i % 5 == 0) && (i / 10) % 10 == 5) {
                list.add(i);

            }
        }

        if (list.isEmpty()) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        }
    }
}