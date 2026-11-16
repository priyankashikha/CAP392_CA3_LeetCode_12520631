class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i=0; i<s.length();i++) {
            int left =i;
            int right =i;
            while(left>= 0 && right<s.length() &&
                   s.charAt(left) ==s.charAt(right)){
                left--;
                right++;
            }
            int left2=i;
            int right2=i+1;
            while(left2 >= 0 && right2 < s.length() &&
                   s.charAt(left2)== s.charAt(right2)) {
                left2--;
                right2++;
            }
            if(right-left- 1 >ans.length()){
                ans =s.substring(left + 1, right);
            }
            if(right2-left2 -1 >ans.length()){
                ans =s.substring(left2 +1, right2);
            }
        }
        return ans;
    }
}
