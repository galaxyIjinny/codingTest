class Solution {
    public int solution(int chicken) {
        /*int coupon = chicken;  // 테스트케이스 9 불가
        while (chicken > 0) {
            chicken /= 10;
            coupon += chicken;
        }

        return coupon / 10;*/
        //
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon / 10;
            answer += service;

            coupon %= 10;
            coupon += service;
            // 아래와 동일
            /*answer += coupon / 10;
            coupon = coupon % 10 + coupon / 10;*/
        }

        return answer;

        // 첫 주문 시 10 마리 값을 지불해야 무료이므로 9로 나누어 떨어질 경우 마지막 한마리 값 지불
        int answer = chicken / 9;  // 10 마리 중 한 마리 무료
        if (chicken > 1 && chicken % 9 == 0) {
            answer--;
        }
        return answer;
    }
}