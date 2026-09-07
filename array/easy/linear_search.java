public class linear_search {
    public static int linersearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 4;
        int resutlt = linersearch(nums, target);
        System.out.println(resutlt);
    }
}
