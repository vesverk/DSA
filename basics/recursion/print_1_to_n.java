class solution2{
    public void printNumber(int no, int count ,int n){
        if(count == n){
            return;
        }
        System.out.println(no);
        printNumber(no+1, count+1,n);
    }
}



public class print_1_to_n {
    public static void main(String[] args){
        solution2 sol = new solution2();
        int n = 5;
        int no = 1;
        sol.printNumber(no, 0, n);

    }
}
