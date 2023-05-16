// TODO: 2023-05-16
// 2525. a=시, b=분, c=분(필요시간). a시 b분 + c분 결과 나타내기. 0<=a<=23, 0<=b<=59이므로 주의.

package 조건문;
import java.util.Scanner;

public class ovenClock_2525 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a + ((b + c) / 60) > 23) {
            System.out.println(a + ((b + c) / 60) - 24 + " " + ((b + c) % 60));
        } else {
            System.out.println(a + ((b + c) / 60) + " " + ((b + c) % 60));
        }
    }
}