// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
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


