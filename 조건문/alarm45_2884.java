// TODO: 2023-05-16  sujin-lim
// 2884. 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

package 조건문;
import java.util.Scanner;

public class alarm45_2884 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        if (a == 0) {
            if (b < 45) {
                System.out.println(23 + " " + ((b + 60) - 45));
            } else {
                System.out.println(a + " " + (b - 45));
            }
        } else {
            if (b < 45) {
                System.out.println((a - 1) + " " + ((b + 60) - 45));
            } else {
                System.out.println(a + " " + (b - 45));
            }
        }
    }
}