public class Solution {
    public int solve(String A) {
        int n=A.length();
        
        A = A.toUpperCase();
        int count = 0;
        for(int i=0;i<n;i++){
            if(A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U'){
                count = (count%10003 ) + ((n-i)%10003);
            }
        }

        return count%10003;
    }
}
