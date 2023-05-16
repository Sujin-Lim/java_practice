// TODO: 2023-05-16
// 8393. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

package 반복문;
import java.util.Scanner;

public class sum_8393 {
    public static void main(String[] args) {
        int n ;
        int result = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
