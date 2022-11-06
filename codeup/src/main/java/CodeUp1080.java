import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
            if(sum >= input) {
                System.out.print(i);
                break;
            }
        }
    }
}