import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

        while(input != 'q') {
            System.out.println(input);
            input = sc.next().charAt(0);
        }
        System.out.println(input);
    }
}