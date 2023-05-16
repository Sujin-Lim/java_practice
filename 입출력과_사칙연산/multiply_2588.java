// TODO: 2023-05-16
// 2588. 세 자리 수 x 세 자리 수.

package 입출력과_사칙연산;
import java.util.Scanner;

public class multiply_2588 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a * ((b%100)%10));
        System.out.println(a * ((b/10)%10));
        System.out.println(a * (b/100));
        System.out.println(a*b);
    }
}