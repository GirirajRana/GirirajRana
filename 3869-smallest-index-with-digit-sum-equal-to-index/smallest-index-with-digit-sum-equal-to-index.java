class Solution {
    public int smallestIndex(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            while(arr[i]>0){
                int digit=arr[i]%10;
                sum+=digit;
                arr[i]=arr[i]/10;
            }
            if(sum==i){
            return i;
            }
        }
        return -1;
    }
}