public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int n=A.length;
        int q=B.length;

        
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                A[i]=1;
            }else{
                A[i]=0;
            }
        }
            
        

        //building PFSum 
        int [] pfs = new int[n];
        pfs[0]=A[0];
        for(int i=1;i<n;i++){
            pfs[i]=pfs[i-1]+A[i];
        }


        //logic
        int [] ans = new int[q];
        for(int i=0;i<q;i++){
           int s=B[i][0];
           int e=B[i][1];

           if(s==0){
               ans[i]=pfs[e];
           }
           else{
               ans[i]=pfs[e]-pfs[s-1];
           }

        }
        return ans;
    }
}
