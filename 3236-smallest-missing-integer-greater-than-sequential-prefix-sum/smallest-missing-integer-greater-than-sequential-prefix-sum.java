class Solution {
    public int missingInteger(int[] arr) {
        int n=arr.length;
        int sum=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1){
                sum=sum+arr[i];
            }else{
                break;
            }
        }

        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}