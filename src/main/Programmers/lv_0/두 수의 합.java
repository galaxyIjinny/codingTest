import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        String answer = numA.add(numB).toString();

        return answer;

        //
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        i = a.length() - 1, j = b.length() - 1;

        while(i >= 0 || j >= 0 || carray > 0) {
            int sum = carray;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();

        //
        /*String answer = "";
        int len1 = a.length();
        int len2 = b.length();
        int maxIdx = Math.max(len1, len2);
        int[] nums = new int[maxIdx];
        for (int i = 0; i < maxIdx - 1; i++) {
            if (i < len1) {
                nums[maxIdx - (i+1)] += Character.getNumericValue(a.charAt(len1 - (i+1)));
            }
            if (i < len2) {
                nums[maxIdx - (i+1)] += Character.getNumericValue(b.charAt(len2 - (i+1)));
            }
            if (nums[maxIdx - (i+1)] > 9) {
                nums[maxIdx - (i+1)] -= 10;
                nums[maxIdx - (i+2)] += 1;
            }
        }
        if (maxIdx - 1 <len1) {
            nums[0] += Character.getNumericValue(a.charAt(len1 - maxIdx));
        }
        if (maxIdx - 1 <len2) {
            nums[0] += Character.getNumericValue(b.charAt(len2 - maxIdx));
        }
        if (nums[0] > 9) {
            nums[0] -= 10;
            answer += "1";
        }
        for (int i = 0; i < maxIdx; i++) {
            answer += String.valueOf(nums[i]);
        }
        return answer;*/
    }
}

//
import java.util.Stack;

class Solution {
    public static String solution(String a, String b) {
        String answer = "";
        String tmp = "";
        Stack<Integer> stack = new Stack<>();

        int shortLen = Math.min(a.length(), b.length());
        int longLen = Math.min(a.length(), b.length());

        if (a.length() != b.length()) {
            if (shortLen == a.length()) {
                for (int i = shortLen; i < longLen; i++) {
                    tmp += "0";
                }
                a = temp + a;
            } else {
                for (int i = shortLen; i < longLen; i++) {
                    tmp += "0";
                }
                b = tmp + b;
            }
        }

        bollean carry = false;
        int sumNum = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int NumA = Integer.parseInt(String.valueOf(a.charAt(i)));
            int NumB = Integer.parseInt(String.valueOf(a.charAt(i)));

            if (carry) {
                sumNum = NumA + NumB + 1;
                carry = false;
            } else {
                sumNum = NumA + NumB;
            }

            if (sumNum >= 10) {
                carry = true;
                stack.push(sumNum - 10);
            } else {
                stack.push(sumNum);
            }
        }

        if (carry) {
            stack.push(1);
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}