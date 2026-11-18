class Solution {
    String[] ones = {"", "One", "Two", "Three", "Four", "Five",
                     "Six", "Seven", "Eight", "Nine", "Ten",
                     "Eleven", "Twelve", "Thirteen", "Fourteen",
                     "Fifteen", "Sixteen", "Seventeen", "Eighteen",
                     "Nineteen"};

    String[] tens = {"", "", "Twenty", "Thirty", "Forty",
                     "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0){
            return "Zero";
        }
        String ans = "";
        int i = 0;
        while (num>0){
            int part = num % 1000;

            if (part!= 0) {
                ans = helper(part) + thousands[i] + " " + ans;
            }
            num = num / 1000;
            i++;
        }
        return ans.trim();
    }
    public String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return ones[num] + " ";
        }
        if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        }
        return ones[num / 100] + " Hundred " + helper(num % 100);
    }
}
