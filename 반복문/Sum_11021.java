// TODO: 2023-05-17
// 11021. a+b 출력

package 반복문;
import java.util.Scanner;

public class Sum_11021 {
    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Case #"+i+": "+ (a+b));

        }

    }
}