// TODO: 2023-05-16
// 2739. 수를 입력받은 뒤, 구구단 n단 출력

package 반복문;
import java.util.Scanner;

public class multiply_2739 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        for (int i = 1; i <10 ; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}