// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
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


