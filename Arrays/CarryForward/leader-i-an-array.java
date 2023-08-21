public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = A.get(A.size()-1);
        result.add(max);
        for(int i =A.size()-2;i>=0;i--)
        {
            if(A.get(i)>max)
            {
                max = A.get(i);
                result.add(max);
               
            }
        }

        return result;
    }
}