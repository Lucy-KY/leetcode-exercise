import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class No2708_MaximumStrengthOfAGroup {
    //First chance 暴力解法
    public long maxStrength(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        long result = 1;
        if(nums[1] == 0 && nums[nums.length-1] == 0)
            return 0;
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                if(nums[i] > 0)
                    result *= nums[i];
                break;
            }
            if(nums[i] == 0 || nums[i+1] == 0)
                continue;
            System.out.println(nums[i]^nums[i+1]);
            if((nums[i]^nums[i+1]) >= 0){
                result = result * nums[i] * nums[i+1];
                i++;
            }
        }
        return result;
    }
    //Second chance 贪心算法
    public long maxStrength2(int[] nums) {
        long numsMin = nums[0];
        long numsMax = nums[0];
        for(int num = 1; num < nums.length; num++){
            long tmp = numsMax;
            numsMax = Math.max(Math.max(numsMax, nums[num]), Math.max(numsMax * nums[num], numsMin * nums[num]));
            numsMin = Math.min(Math.min(numsMin, nums[num]), Math.min(tmp * nums[num], numsMin * nums[num]));
        }
        return numsMax;
    }
}
