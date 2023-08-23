public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int [] ans = new int [C-B+1];
        int j=0;
        for(int i=B;i<=C;i++){
            ans[j]=A[i];
            j++;
        }


        return ans;
    }


}
