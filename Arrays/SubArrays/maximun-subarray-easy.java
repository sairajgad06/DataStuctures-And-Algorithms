// You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.


//O(n2) approach simple 


public class Solution {
    public int maxSubarray(int A, int B, int[] C) {
        int ans=0;
        int n=C.length;
        for(int i=0;i<n;i++){
            int sum=0;
            if(sum<=ans){
                for(int j=i;j<n;j++){
                    sum=sum+C[j];
                    if(sum<=B&&ans<=sum){
                        ans=sum;
                    }
                }
            }else{
                return 0;
            }
        }

        return ans;

    }
}



//O(n) 2 pointer approach


public class Solution {
    public int maxSubarray(int A, int B, int[] C) {
        int n = C.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;

        while(j<n){
            if(sum+C[j]<=B){
                sum=sum+C[j];
                max=Math.max(max,sum);
                j++;
            }else if(i<j){
                sum=sum-c[i];
                i++;
            }else{
                i++;
                j++;
            }
        }

        return max
    }
}






