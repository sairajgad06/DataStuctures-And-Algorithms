public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {

        int currProf=0;
        int n=A.length;
        int maxProf=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minPrice=Math.min(minPrice,A[i]);
            currProf=(A[i]-minPrice);
            maxProf=Math.max(maxProf,currProf);

        }

        return maxProf;

    }
}
