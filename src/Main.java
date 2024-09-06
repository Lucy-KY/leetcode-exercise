import java.util.Scanner;

public class Main {
    static No2024_MaxConsecutiveAnswers no2024 = new No2024_MaxConsecutiveAnswers();

    public static void main(String[] args) {
        Scanner runNumScanner = new Scanner(System.in);
        System.out.println("Input the topic number: ");
        String runNum = runNumScanner.nextLine();
        if(runNum.equals("2024")) {
            no2024.print();
        }
    }
}