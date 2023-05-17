// TODO: 2023-05-17
// 2438. 왼쪽 정렬 별 찍기

package 반복문;
import java.util.Scanner;

public class Star_2438 {
    public static void main(String[] args) {

        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}