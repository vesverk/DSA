class solution1 {
    public void printName(String name, int count, int N){
        if(count == N){
            return;
        }
        System.out.println(name);

        printName(name, count+1, N);
    }
}




public class print_n_name {
    public static void main(String[] args){
        solution1 sol = new solution1();
        int N = 5;
        String name = "vaibhav";

        sol.printName(name, 0, N);
    }
}
