import java.util.Arrays;

public class check_sorting {
    public static boolean issorted(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        System.out.print(issorted(nums));
    }
}

