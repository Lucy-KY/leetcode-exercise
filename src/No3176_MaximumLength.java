public class No3176_MaximumLength {
    public int maximumLength(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0;
        int len = 0;
        for(; right < nums.length-1; right++){
            if(nums[right] != nums[right+1])
                len++;
            if(len > k){
                while(nums[left] == nums[left+1])
                    left++;
                len--;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
