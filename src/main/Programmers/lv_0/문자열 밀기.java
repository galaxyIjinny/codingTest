class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int len = A.length();
        StringBuilder sb;
        String pushedA = A;

        for (int i = 0; i < len; i++) {
            if (pushedA.equals(B)) return answer;

            sb = new StringBuilder(pushedA.substring(len - 1));
            sb.append(pushedA.substring(0, len - 1));
            pushedA = sb.toString();

            //temp = temp.charAt(A.length() - 1) + temp.substring(0, A.length() - 1);

            answer++;
        }

        return -1;



        // char 배열 시도하다 실패..
        int answer = 0;
        int len = A.length();
        char[] Aarr = A.toCharArray();

        for (int i = 0; i < len; i++) {
            if (Arrays.toString(Aarr).equals(B)) break;

            char temp = Aarr[len - 1];
            for (int j = 1; j < len; j++) {
                Aarr[i] = Aarr[i - 1];
            }
            Aarr[0] = temp;
            answer++;
        }

        if (!Arrays.toString(Aarr).equals(B))
            answer = -1;

        return answer;

        //
        STring tempB = B.repeat(2);
        return tempB.indexOf(A);
        //
        return (B + B).indexOf(A);
    }
}

