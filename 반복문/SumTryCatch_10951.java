// TODO: 2023-05-17
// 10951. 계속해서 입력값 받아 a+b출력. try-catch문을 넣지 않으면 런타임 오류가 남.

package 반복문;
import java.util.Scanner;

public class SumTryCatch_10951 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        while (a != 0) {
            try {
                if (b != 0) {
                    System.out.println(a + b);
                    a = in.nextInt();
                    b = in.nextInt();
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}