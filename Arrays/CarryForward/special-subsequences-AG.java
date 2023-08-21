public class Solution {
    public int solve(String A) {
        int a=0;
        int ans=0;

        int mod=(int)(Math.pow(10,9))+7;

        for(int i=0;i<A.length();i++){

            if(A.charAt(i)=='A')
            {
             a++;
            }

            if(A.charAt(i)=='G')
            {
             ans+=a;
             ans%=mod;
            }
        }
        return ans;
    } 
}
