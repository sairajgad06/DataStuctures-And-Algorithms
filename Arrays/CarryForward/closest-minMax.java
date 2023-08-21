public class Solution {
    public int solve(int[] A) {

        int minEleId=0;
        int maxEleId=0;
        int n=A.length;
        int Min=Integer.MAX_VALUE;
        int Max=Integer.MIN_VALUE;
        int result =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(A[i]<Min){
               Min = A[i];
               minEleId=i;
            }         
            if(A[i]>Max){
               Max = A[i];
               maxEleId=i;
            }         
        }
          
        int minIndex=Math.min(minEleId,maxEleId);

        for (int i= minIndex; i<n;i++){
            if(A[i]==Max){
                maxEleId=i;
                result=Math.min(result,Math.abs( maxEleId - minEleId) +1 );
            }
            else if(A[i]==Min){
                minEleId=i;
                result=Math.min(result, Math.abs(maxEleId-minEleId)+1);
            }
        }
        return result;
        
    }
}
