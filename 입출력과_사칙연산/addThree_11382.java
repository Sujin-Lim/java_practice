// TODO: 2023-05-16
// 11382. 숫자 세 개 더하기

package 입출력과_사칙연산;
import java.util.Scanner;

public class addThree_11382 {
    public static void main(String[] args) {
        long a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();
        System.out.print(a+b+c);
    }
}