class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int last_dig = x%10;
            x/=10;
            reverse = reverse*10+last_dig;
        }
        if(temp==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}