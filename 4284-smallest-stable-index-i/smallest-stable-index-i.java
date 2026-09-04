class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n= arr.length;
        for(int i=0;i<n;i++){
            int mx=arr[0];
            int mn=arr[i];
            for(int j=0;j<=i;j++){
                mx=Math.max(mx,arr[j]);
            }

            for (int j = i; j <n; j++) {
                mn = Math.min(mn, arr[j]);
            }

            int score=mx-mn;
            if(score<=k) return i;
        }
        return -1;

    }
}