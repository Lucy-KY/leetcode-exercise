import java.util.Scanner;

public class No2024_MaxConsecutiveAnswers {
    public void print(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input answerKey and k: ");
        String answerKey = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println("Answer: "+maxConsecutiveAnswers(answerKey, k));
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int num = 0;
        for(int l = 0, r = 0, t = 0, f = 0; r < answerKey.length(); r++){
            if(answerKey.charAt(r) == 'T')
                t++;
            else
                f++;
            if(Math.min(f, t) > k){
                if(answerKey.charAt(l) == 'T')
                    t--;
                else
                    f--;
                l++;
            }
            num = Math.max(num, r-l+1);
        }
        return num;
    }
}
