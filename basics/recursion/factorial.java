class Solution5{
    public static long fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n - 1);
    }
}


public class factorial {
    public static void main(String[] args) {
        int number = 2;
        long result = Solution5.fact(number);
        System.out.print(result);
    }

}
