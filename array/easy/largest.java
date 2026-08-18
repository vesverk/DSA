public class largest {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,10};
        int max = 0;
        for(int x: arr){
            max = Math.max(max, x);
        }
        System.out.print(max);
    }
}    
