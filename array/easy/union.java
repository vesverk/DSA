import java.util.Arrays;
import java.util.TreeSet;
public class union {
    public static int[] unionarr(int[] arr1, int[] arr2){
        TreeSet<Integer> st = new TreeSet<>();
        int index = 0;
        for(int i:arr1){
            st.add(i);
        }
        for(int i:arr2){
            st.add(i);
        }
        int[] array = new int[st.size()];
        for(int i:st){
            array[index] = i;
            index++;
        }
        return array;
    }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4,5};
        int[] arr2 = {2,3,4,4,5};

        int[] result = unionarr(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}
