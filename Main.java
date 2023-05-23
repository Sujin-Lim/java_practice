// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int j = 1; j < n; j++) {
            if (a[j]>a[j+1])
                max = a[j];
            else
                max = a[j+1];
        }


    }
}


