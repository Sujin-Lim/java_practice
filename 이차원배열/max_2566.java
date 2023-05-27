// 230527
// 2566. 9x9 행렬에서 최댓값 찾기. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치 출력

package 이차원배열;

import java.util.Scanner;

public class max_2566 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);

        // 최댓값의 위치 출력
        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == max && !found) {
                    row = i + 1;
                    col = j + 1;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println(row+" "+col);
    }
}