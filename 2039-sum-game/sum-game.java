class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int leftQ=0;
        int rightQ=0;

        int leftSum=0;
        int rightSum=0;
        
        //first half
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                leftQ++;
            }else{
                leftSum+=num.charAt(i)-'0';
            }
        }

        //second half
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rightQ++;
            }else{
                rightSum+=num.charAt(i)-'0';
            }
        }

        int sumDiff=leftSum-rightSum;
        int qDiff=leftQ-rightQ;

        //question mark equally distributed
        if(qDiff == 0){
            if(sumDiff ==0){
                return false;
            }else{
                return true;
            }
        }

        //unequal question mark with odd diff
        else if((leftQ+rightQ) %2 !=0){
            return true;
        }

        //unequal question mark with even diff
        else{
            int maxDifference=-9*qDiff /2;

            if(sumDiff==maxDifference){
                return false;
            }else{
                return true;
            }
        }
    }
}