public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int n=A.size();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> sub = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sub.add(A.get(k));
                }
                ans.add(sub);
            }
        }


        return ans;
    }
}
