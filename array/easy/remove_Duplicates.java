import java.util.TreeSet;

// public class remove_Duplicates {
//     public int removeDuplicates(int[] nums){
//         HashSet<Integer> st = new HashSet<>();
//         int index = 0;
//         for(int num:nums){
//             if(!st.contains(num)){
//                 st.add(num);
//                 nums[index] = num;
//                 index ++;
//             }

//        }
//        return index;
//     }

// public class remove_Duplicates {
//     public static int removeDuplicates(int[] nums){
//         TreeSet<Integer> st = new TreeSet<>();
//         int index = 0;
//         for(int i=0;i<nums.length;i++){
//             st.add(nums[i]);
//         }
//         for(int i:st){
//             nums[index] = i;
//             index++;
//         }
//         return index;
//     }

    // public class remove_Duplicates {
    // public static int removeDuplicates(int[] nums){
    //     // TreeSet<Integer> st = new TreeSet<>();
    //     int index = 0;
    //     int k=1;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i] != nums[k-1]){
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }
    //     return k;
    // }
    public class remove_Duplicates {
    public static int removeDuplicates(int[] nums){
        // TreeSet<Integer> st = new TreeSet<>();
        int index = 0;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[k]){
                continue;
            }
            else{
                k++;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = t
                        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[k]){
                continue;
            }
            else{
                k++;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }

        }
        return k+1; 
 
        }
        return k+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3};
        int k = removeDuplicates(nums);
        System.out.print(k);
    }
}

