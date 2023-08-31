public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        ArrayList<Integer> ans = new ArrayList<>();

        int window = (2 * B) +1;
        int n=A.size();

        for(int i=0;i<n-window+1;i++){
            int prev = -1;
            int flag = 1;
            for(int j=i;j<i+window;j++){
                if(A.get(j)==prev){
                    flag=0;
                    break;
                }
                prev=A.get(j);
            }

            if(flag==1){
                 ans.add(i+B);
            }
        }

        return ans;
    }
}
