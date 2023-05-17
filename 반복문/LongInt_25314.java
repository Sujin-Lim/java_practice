// TODO: 2023-05-17
// 25314. n:정수

package 반복문;
import java.util.Scanner;

public class LongInt_25314 {
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i <=(n/4) ; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

    }
}