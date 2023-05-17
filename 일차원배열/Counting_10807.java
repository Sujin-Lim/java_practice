// TODO: 2023-05-17
// 10807. n개의 정수중 정수 v가 몇 개 인가?
// 마지막에 in.close();를 해줘야 함..

package 일차원배열;
import java.util.Scanner;

public class Counting_10807 {
    public static void main(String[] args) {
        int n, v;
        int s = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        v = in.nextInt();
        for (int j = 0; j < n; j++) {
            if (arr[j] == v) {
                s++;
            }
        }
        System.out.println(s);
        in.close();
    }
}