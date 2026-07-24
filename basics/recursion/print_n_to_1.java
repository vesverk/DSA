class Solution3 {
    public void printNumber(int no) {
        if (no == 0) {
            return;
        }

        System.out.println(no);
        printNumber(no - 1);
    }
}

public class print_n_to_1 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        sol.printNumber(5);
    }
}