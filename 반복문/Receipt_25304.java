// TODO: 2023-05-17
// 25034. x=총 금액, n=물건 종류 수, a:물건 가격, b: 개수

package 반복문;
import java.util.Scanner;

public class Receipt_25304 {
    public static void main(String[] args) {
//        x= 총 금액, n=물건 종류 수
        int x, n;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            sum += (a * b);
        }
        System.out.println(sum==x?"Yes":"No");

    }
}
