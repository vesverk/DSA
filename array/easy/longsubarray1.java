import java.util.HashMap;

public class longsubarray1{
    public static int longestsubarraywithsumk(int[] nums,int k){
        int sum = 0;
        int longlen = 0;
        HashMap<Integer, Integer> presum = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum == k){
                longlen = Math.max(longlen,i+1);
            }
            int rem = sum-k;
             if(presum.containsKey(rem)) {
                int len = i - presum.get(rem);
                longlen = Math.max(longlen, len);
            }

            if(!presum.containsKey(sum)) {
                presum.put(sum, i);
            }
        }
        return longlen;
    }
}