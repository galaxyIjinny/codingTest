class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();

        int binInt1 = Integer.parseInt(bin1);
        int binInt2 = Integer.parseInt(bin2);
        int sum = 0;

        for (int i = bin1.length() - 1; i >= 0; i--) {
            int temp = binInt1 % 10;
            sum += temp * Math.pow(2, bin1.length() - 1 - i);
            binInt1 /= 10;
        }
        for (int i = bin2.length() - 1; i >= 0; i--) {
            int temp = binInt2 % 10;
            sum += temp * Math.pow(2, bin2.length() - 1 - i);
            binInt2 /= 10;
        }

        if (sum == 0) {
            return "0";
        }

        while (sum > 0) {
            sb.append(sum % 2);
            sum /= 2;
        }

        return sb.reverse().toString();

        //return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
        //return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}

//

class Solution {
    public String solution(String bin1, String bin2) {
        BigInteger bin1Binary = new BigInteger(bin1, 2);
        BigInteger bin2Binary = new BigInteger(bin2, 2);

        int num = (bin1Binary.add(bin2Binary)).intValue();

        return Integer.toBinaryString(num);

        //
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(a + b);
        return answer;
    }
}