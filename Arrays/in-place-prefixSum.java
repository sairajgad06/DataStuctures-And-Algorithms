public class Solution {
    public int[] solve(int[] A) {
      int n=A.length;
      int[] ps =new int[n];
      ps[0]=A[0];
      for(int i=1;i<n;i++){
          ps[i]=ps[i-1]+A[i];
      }
      return ps;
    }
}
