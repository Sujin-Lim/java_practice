// TODO: 2023-05-16
// 2480.
// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

package 조건문;
import java.util.Scanner;

public class threeDice_2480 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

//        조건을 너무 많이 사용해서 구질구질한 느낌?
        if (a == b && b == c) {
            System.out.print(10000 + (a * 1000));
        } else if (a==b) {
            System.out.print(1000 + (a * 100));
        } else if (b==c) {
            System.out.print(1000 + (b * 100));
        } else if (a == c) {
            System.out.print(1000 + (c * 100));
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.print(a * 100);
                } else {
                    System.out.println(c * 100);
                }
            } else {
                if (b > c) {
                    System.out.println(b * 100);
                } else {
                    System.out.println(c * 100);
                }
            }

        }


    }
}

