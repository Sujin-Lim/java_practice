// TODO: 2023-05-16
// 10950.
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

package 반복문;
import java.util.Scanner;

public class add_10950 {
    public static void main(String[] args) {
        int a, b, t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i = 1; i <= t ; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a + b);
        }
    }
}