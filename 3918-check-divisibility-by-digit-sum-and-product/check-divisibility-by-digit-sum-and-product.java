class Solution {
    public boolean checkDivisibility(int n) {
        boolean flag=false;
        int sum=0;
        int product=1;
        int original=n;

        while (n > 0) {
            int digit = n % 10;
            sum=sum+digit;
            product*=digit;
            n = n / 10;
        }
        if (original % (sum + product) == 0) { 
            flag = true; 
        } 
        return flag;
    }
}