// TODO: 2023-05-18
// 2562. 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

package 일차원배열;

import java.util.Scanner;

public class Max_2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int i;
        int c = 0;
        for (i = 0; i <9 ; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                c = i+1;
            }
        }

        System.out.println(max);
        System.out.println(c);
    }
}