// 230524
// 10810. 바구니에 공 넣기

package 일차원배열;

import java.util.Scanner;

public class Ball_10810 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       // n 바구니 갯수
        int[] arr = new int[n];     // arr 바구니
        int m = in.nextInt();       // m 시도 횟수

        for (int i = 0; i < m; i++) {
            int[] x = new int[3];       // 각 배열에 값을 넣는 걸 반복문으로 처리 가능할 듯
            x[0] = in.nextInt();
            x[1] = in.nextInt();
            x[2] = in.nextInt();
            for (int j = x[0]; j <= x[1] ; j++) {
                arr[j-1] = x[2];
            }
        }
        for (int j : arr) {
            System.out.printf(j + " ");
        }

    }
}

