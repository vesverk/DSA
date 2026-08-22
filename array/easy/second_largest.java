public class second_largest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,6,5};
        int largest = 0;
        int secondlarg = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                secondlarg = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlarg && arr[i]<largest){
                secondlarg = arr[i];
            }
        }
        
        // System.out.print(arr.length);
        System.out.print(largest);
        System.out.print(secondlarg);
    }
}

