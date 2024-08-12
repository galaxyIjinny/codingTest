class Solution {
    public int solution(int[] common) {
        int a = common[0];

        // 등비로 조건을 확인하면 0 으로 나누게 되는 경우 발생하여 런타임 에러
        if (common[2] - common[1] == common[1] - common[0]) {
            int d = common[1] - common[0];
            return a + d * common.length;
        } else {
            int r = common[1] / common[0];
            double last = Math.pow(r, common.length);
            return (int) a * (int) last;
        }

        //
        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }
    }
}

