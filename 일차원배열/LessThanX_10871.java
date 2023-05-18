// TODO: 2023-05-18
// 10871. 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

package 일차원배열;
import java.util.Scanner;

public class LessThanX_10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < x) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}