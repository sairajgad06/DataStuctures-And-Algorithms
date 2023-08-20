public class Solution {
    public int EquilibriumIndex(int[] A) {
        int n=A.length;
        if (n==0){
            return -1;
        }

        //building PFSum
        int [] PFSum = new int[n];
        PFSum[0]=A[0];
        for(int i=1;i<n;i++){
            PFSum[i]=PFSum[i-1]+A[i];
        }

        //logic
        for(int i=0;i<n;i++){
            int LS=0,RS=0;
            if(i==0){
                LS = 0;
            }else{
                LS=PFSum[i-1];
            }
            RS=PFSum[n-1]-PFSum[i];
            if(LS==RS){
                return i;
            }
        }
        return -1;
    }
}
