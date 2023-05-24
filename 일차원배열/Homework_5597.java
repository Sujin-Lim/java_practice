// 230524
// 5597. 한 반 30명 학생. 과제 28명 제출. 안 낸 사람 두 명의 번호? 

package 일차원배열;

import java.util.Scanner;

public class Homework_5597 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            arr[in.nextInt()-1] = 1;
        }
        int j =0;
        while(j<30) {
            if (arr[j] == 0) {
                System.out.println((j+1));
            }
            j++;
        }
    }
}