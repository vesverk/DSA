public class bubble_sort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("after sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("before selection sort");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

        bubblesort(arr);
    }   
}
