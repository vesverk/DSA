import java.util.Arrays;
public class second_largest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,6,5};
        int n = arr.length;
        Arrays.sort(arr);
        if(n == 0 && n == 1){
            System.out.print("-1" );
            return;
        }
        int small = arr[1];
        int largest = arr[n-2];

        System.out.println(small);
        System.out.println(largest);
    }
}

