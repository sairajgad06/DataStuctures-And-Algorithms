public class Solution {
    public int bulbs(int[] A) {

        int n=A.length;
        int state=0;
        int ans=0;
        for (int i=0;i<n;i++){
            if(A[i]==1&&state==1){
                state=state-1;
                ans++;
            }else if(A[i]==0&&state==0){
                state=state+1;
                ans++;
            }
            
        }
        return ans;
    }
}




///solved by greedy algo
