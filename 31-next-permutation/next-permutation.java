class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int pivot=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot!=-1){
            for(int j=n-1;j>=pivot;j--){
                if(arr[j]>arr[pivot]){
                    int temp=arr[j];
                    arr[j]=arr[pivot];
                    arr[pivot]=temp;
                    break;
                }
            }
        }


        for(int left=pivot+1,right=n-1;left<right;left++,right--){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }


    }
}