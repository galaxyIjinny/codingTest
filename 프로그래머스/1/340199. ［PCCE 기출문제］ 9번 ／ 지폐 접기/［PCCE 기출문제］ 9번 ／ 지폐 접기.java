class Solution {
    public int solution(int[] wallet, int[] bill) {
        int maxWallet = Math.max(wallet[0], wallet[1]);
        int minWallet = Math.min(wallet[0], wallet[1]);
        int maxBill = Math.max(bill[0], bill[1]);
        int minBill = Math.min(bill[0], bill[1]);
        int answer = 0;
        
        while (maxBill > maxWallet || minBill > minWallet) {
            if (maxBill / 2 > minBill) {
                maxBill /= 2;
            } else {
                int temp = minBill;
                minBill = maxBill / 2;
                maxBill = temp;
            }
            answer++;
        }
        
        return answer;
    }
}