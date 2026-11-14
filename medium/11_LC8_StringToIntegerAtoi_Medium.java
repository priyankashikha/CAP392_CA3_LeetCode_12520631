
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long n= 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
   
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            n= n * 10 + digit;
            if (n* sign > 2147483647) {
                return 2147483647;
            }
            if (n* sign < -2147483648L) {
                return -2147483648;
            }
            i++;
        }
        return (int)(n* sign);
    }
}
