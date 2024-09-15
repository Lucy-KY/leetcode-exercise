public class No2552_CountQuadruplets {
    public long countQuadruplets(int[] nums) {
        long ans = 0;
        int[] pre = new int[nums.length+1];
        for(int j = 0; j < nums.length; j++){
            int suf = 0;
            for(int k = nums.length-1; k > j; k--){
                if(nums[j] > nums[k])
                    ans += (long) pre[nums[k]] * suf;
                else
                    suf++;
            }
            for(int i = nums[j]; i < nums.length+1; i++)
                pre[i]++;
        }
        return ans;
    }
}
