// TODO: 2023-05-17
// 10952. a+b 입력 마지막에는 0,0입력

package 반복문;
import java.util.Scanner;

public class Sum_10952 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        while (a != 0) {
            if (b != 0) {
                System.out.println(a + b);
                a = in.nextInt();
                b = in.nextInt();
            } else break;
        }
    }
}
