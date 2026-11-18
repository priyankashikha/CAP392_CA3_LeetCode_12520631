class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for(long i =1; i <=n; i =i*10){
            long before = n/i;
            long current = before%10;
            long after = n%i;
            if(current==0){
                count +=(before/10)*i;
            } 
            else if(current==1){
                count+=(before/10)*i + after+1;
            } 
            else{
                count+= (before/10+1)*i;
            }}
        return count;
    }}
