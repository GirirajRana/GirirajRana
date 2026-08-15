class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean hasnonzero=false;
        for(int num:nums){
            xor=xor^num;
            if(num!=0){
                hasnonzero=true;
            }
        }
        if(xor!=0){
            return n;
        }
        if (!hasnonzero){
            return 0;
        }
        return n-1;
    }
}