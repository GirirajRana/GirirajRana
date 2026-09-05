class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n=arr.length;
        int[] suffixmin=new int[n];
        suffixmin[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],arr[i]);
        }

        int prefixMax=arr[0];
        for(int i=0;i<n;i++){
            prefixMax=Math.max(prefixMax,arr[i]);

            if(prefixMax-suffixmin[i]<=k){
                return i;
            }
        }

        return -1;
    }
}