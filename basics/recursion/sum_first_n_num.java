class Solution4{
    public void sum_of_n_num(int n){
        if(n==0){
            return;
        }
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
public class sum_first_n_num {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        sol.sum_of_n_num(4);
    }
}