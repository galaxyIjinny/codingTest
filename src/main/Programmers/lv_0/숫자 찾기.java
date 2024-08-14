class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String numArr = String.valueOf(num);
        //
        /*String kStr = String.valueOf(k);
        int answer = numArr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;*/

        for (int i = 0; i < numArr.length(); i++) {
            //
            if (Integer.parseInt(String.valueOf(numArr.charAt(i))) == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;

        // reutnr ("-" + num).indexOf(String.valueOf(k)); // 인덱스 1부터 카운트 하는 방법

        //
        /*int count = 1;
        while (num / 10 > 0) {
            if (num % 10 == k) {
                answer = count;
            }
            num /= 10;
            ++count;
        }
        if (num % 10 == k) {
            answer = count;
        }
        return answer > 0 ? count - answer + 1 : -1;*/
    }
}

