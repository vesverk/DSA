public class left_rotate_k {
    public static void LeftRotateK(int[] arr , int k){
        k = k%arr.length;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k] = arr[i];
        }
        for(int i = arr.length-k;i<arr.length;i++){
            arr[i] = temp[i-(arr.length-k)];
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        LeftRotateK(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }        
    }
}
