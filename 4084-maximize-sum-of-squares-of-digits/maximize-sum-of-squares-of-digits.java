class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        // Impossible: maximum possible digit sum is 9 * num
        if (sum > 9 * num) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num; i++) {
            if (sum >= 9) {
                ans.append('9');
                sum -= 9;
            } else {
                ans.append((char) ('0' + sum));
                sum = 0;

                // Remaining digits are 0
                while (ans.length() < num) {
                    ans.append('0');
                }

                break;
            }
        }

        return ans.toString();
    }
}