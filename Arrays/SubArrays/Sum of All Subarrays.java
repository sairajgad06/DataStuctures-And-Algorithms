public class Solution {
    public long subarraySum(int[] A) {
        long ans=0;
        for(int i=0;i<A.length;i++){
            ans+=((long)A[i]*(i+1)*(A.length-i));
        }
        return ans;
       
    }
}
