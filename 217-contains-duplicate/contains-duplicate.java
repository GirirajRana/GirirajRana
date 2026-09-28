class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                flag=true;
            }
            set.add(nums[i]);
        }
        return flag;
    }
}