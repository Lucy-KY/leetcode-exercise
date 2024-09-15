import java.util.*;

public class No740_DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int numMax = Arrays.stream(nums).max().getAsInt();
        int numMin = Arrays.stream(nums).min().getAsInt();
        int[] dp = new int[numMax-numMin+1];
        int[] newNums = new int[numMax-numMin+1];
        for(int num:nums)
            newNums[num-numMin] += num;
        dp[0] = newNums[0];
        dp[1] = Math.max(newNums[0],newNums[1]);
        for(int i = 2; i < newNums.length; i++){
            dp[i] = Math.max(dp[i-2]+newNums[i], dp[i-1]);
        }
        return Math.max(dp[dp.length-1], dp[dp.length-2]);
    }
}
