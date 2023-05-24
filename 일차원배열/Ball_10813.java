// 230524
// 10813. 공 바꾸기

package 일차원배열;

import java.util.Scanner;

public class Ball_10813 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       // n 바구니 갯수
        int[] arr = new int[n];     // arr 바구니
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int m = in.nextInt();       // m 시도 횟수
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y-1]=z;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}