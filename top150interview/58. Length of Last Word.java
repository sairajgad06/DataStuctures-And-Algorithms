// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

 

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.


class Solution {
    public int lengthOfLastWord(String s) {
        int n= s.length();
        int length =0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
                if(i==0){
                    return length;
                }
                if(s.charAt(i-1)==' '){
                    break;
                }
            }
        }

        return length;
    }
}







//second approach but with SC:O(N) using trim() function

class Solution {
    public int lengthOfLastWord(String s) {
        String newstr = s.trim();
        s=s.trim();
       int count=0;
        int i = s.length()-1;
        while(i >= 0 && newstr.charAt(i)!=' '){
            count++;
            i--;
        } return count;
    }
}