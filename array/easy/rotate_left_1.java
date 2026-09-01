public class rotate_left_1 {
    public void RotateLeft(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
    }
    public static void main(String[] args) {
        rotate_left_1 obj = new rotate_left_1();
        int[] arr = {1,2,3,4,5};
        obj.RotateLeft(arr);
        for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " ");
        }
    }
}
