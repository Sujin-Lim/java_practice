// TODO: 2023-05-16
// 1330. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

package 조건문;
import java.util.Scanner;

public class twoNumber_1330 {
    public static void main(String[] args) {
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        if (A > B) {
            System.out.print(">");
        } else if (A==B) {
            System.out.print("==");
        }
        else {
            System.out.println("<");
        }
    }
}