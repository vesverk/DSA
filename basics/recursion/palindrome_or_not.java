class Solution7{
    public boolean palindrome(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        for(int i =0; i<=s.length()/2;i++){
            int j = s.length()-1-i;
            if(s.charAt(i)!=s.charAt(j)){
                return false;  
            }

            
        }
        return true;
    }
}

public class palindrome_or_not {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        boolean result = sol.palindrome("hannah");
        System.out.print(result);
    }
}
