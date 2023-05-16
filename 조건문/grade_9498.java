// TODO: 2023-05-16
// 9498. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

package 조건문;
import java.util.Scanner;

public class grade_9498 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        if(a>=90)
            System.out.println("A");
        else if (a >= 80)
            System.out.println("B");
        else if (a >= 70)
            System.out.println("C");
        else if (a >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}