import java.util.*;

public class No1636_FrequencySort {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            list.add(num);
        }
//        int tmp = nums[0];
//        int tmp_num = 1;
//        for(int i = 1; i < nums.length; i++){
//            if(tmp == nums[i])
//                tmp_num++;
//            else{
//                map.put(tmp, tmp_num);
//                tmp = nums[i];
//                tmp_num = 1;
//            }
//            if(i == nums.length-1)
//                map.put(tmp, tmp_num);
//        }
        Collections.sort(list, (a, b)->{
            int map1 = map.get(a);
            int map2 = map.get(b);
            return map1 == map2?b-a:map1-map2;
        });
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
