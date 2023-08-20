public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
      int n= A.length;
      long[] ps= new long[n];
      ps[0]=A[0];
      for(int i=1;i<n;i++){
          ps[i]=ps[i-1]+A[i];
      }
        int m=B.length;
        long[] ans = new long[m];
        for(int i=0;i<m;i++){
            int start = B[i][0];
            int end = B[i][1];
            if(start==0){
                ans[i]=ps[end];

            }else{
                ans[i]=ps[end]-ps[start-1];
            }
        }
        return ans;
    }
}
