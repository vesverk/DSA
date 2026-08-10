class Solution6{
    public static int febo(int n){
        if(n<=1){
            return n;
        }
        return febo(n-1) + febo(n-2);
    }
}


public class febonacci {
    public static void main(String[] args) {
        int result = Solution6.febo(3);
        System.out.print(result);
    }
}
