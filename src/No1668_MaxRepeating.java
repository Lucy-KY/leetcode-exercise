import java.util.Arrays;
import java.util.List;

public class No1668_MaxRepeating {
    public int maxRepeating(String sequence, String word) {
        int[] dp = new int[sequence.length()];
        Arrays.fill(dp, 0);
        int init = sequence.indexOf(word) + word.length()-1;
        dp[init]++;
        for(int i = init+1; i < sequence.length(); i++){
            boolean flag = true;
            for(int j = 0; j < word.length(); j++){
                if(sequence.charAt(i-word.length())!=word.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                dp[i] = dp[i-word.length()]+1;
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
