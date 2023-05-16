// TODO: 2023-05-16 sujin-lim
// 2753. 윤년

package 조건문;
import java.util.Scanner;

public class leapYear_2753 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}