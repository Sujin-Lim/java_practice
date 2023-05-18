// TODO: 2023-05-18
// 10818. n은 입력받는 정수의 갯수. 입력받은 값 중에 최대, 최소값 찾기

package 일차원배열;

import java.util.Scanner;

public class MinMax_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}