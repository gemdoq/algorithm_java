import java.util.Scanner;

public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a>b) ? a : b;
        System.out.println(max);
        sc.close();
    }
}