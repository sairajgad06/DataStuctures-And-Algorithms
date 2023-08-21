public class Solution {
    public int[] solve(int[] A) {
        int n= A.length;
        int [] left = new int [n];
        int [] right = new int [n];
    

        //building left Prod array
        left[0]=A[0];
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*A[i];
            
        }
            //building right Prod array
        right[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*A[i];
        }

        int [] op = new int [n];

        for(int i=0;i<n;i++){
            if(i==0){
                op[i]=right[1];

            }else if(i==n-1){
                op[i]=left[n-2];
            }
            else op[i]=left[i-1]*right[i+1];
        }

        return op;




      
    } 
}
