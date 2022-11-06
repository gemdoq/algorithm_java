import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char t = sc.next().charAt(0);
        char a = 'a';

        while(a<=t) {
            System.out.print(a+" ");
            a++;
        }
    }
}