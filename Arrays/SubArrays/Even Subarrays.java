public class Solution {
    public String solve(int[] A) {
        if(A.length%2==0 && A[0]%2==0 && A[A.length-1]%2==0){
            return "YES";

        }
        return "NO";
    }

}
