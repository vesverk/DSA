public class continous_one {
    public static int continousone(int[] nums){
        int max_conti = 0;
        int count = 0;
        for(int i=0;i<=nums.length;i++){
            if (nums[i] == 1){
                count++;
                if(max_conti<count){
                    max_conti = count;
                }
            }
            count = 0;
        }
        return max_conti;
    }
}
