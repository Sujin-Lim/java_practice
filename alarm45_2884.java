
import java.util.Scanner;

public class alarm45_2884 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        if (a == 0) {
            if (b < 45) {
                System.out.println(23 + " " + ((b + 60) - 45));
            } else {
                System.out.println(a + " " + (b - 45));
            }
        } else {
            if (b < 45) {
                System.out.println((a - 1) + " " + ((b + 60) - 45));
            } else {
                System.out.println(a + " " + (b - 45));
            }
        }
    }
}