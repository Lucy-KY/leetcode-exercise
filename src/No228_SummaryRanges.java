import java.util.ArrayList;
import java.util.List;

public class No228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]+1 != nums[i+1]){
                if(i != left){
                    StringBuilder builder = new StringBuilder();
                    builder.append(nums[left]);
                    builder.append("->");
                    builder.append(nums[i]);
                    str.add(builder.toString());
                }
                else
                    str.add(String.valueOf(nums[left]));
                left = i+1;
            }
        }
        return str;
    }
}
