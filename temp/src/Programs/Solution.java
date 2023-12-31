package Programs;

class Solution {
    public static void main(String[] args) {
        isPalindrome(-121);

    }
    public static  boolean isPalindrome(int x) {
        if(x<0){
            x=-1*x;
        }
        int result=0;
        int original=x;
        while(x!=0){
            int r =x%10;
            result=result*10+r;
            x=x/10;
        }
        if (original==result) return true;
        else return false;
    }
}