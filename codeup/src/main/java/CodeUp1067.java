import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // print is a positive or negative number
        if (a > 0) {
            System.out.println("plus");
            } else {
            System.out.println("minus");
        }
        // print is a even or odd number
        if (a % 2 == 0) {
            System.out.println("even");
            } else {
            System.out.println("odd");
        }
    }
}