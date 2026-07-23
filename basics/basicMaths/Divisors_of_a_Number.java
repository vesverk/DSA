public class Divisors_of_a_Number {
    public static void main(String[] args){
        int input = 100;
        for(int n=1;n<=input;n++){
            if(input%n==0){
                System.out.print (n + ",");
            }  
        }
    }
}
