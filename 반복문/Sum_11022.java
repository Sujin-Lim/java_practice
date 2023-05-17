// TODO: 2023-05-17
// 11022. a+b

package 반복문;
import java.util.Scanner;

public class Sum_11022 {
    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Case #"+i+": "+ a +" + "+b+" = "+ (a+b));

        }

    }
}