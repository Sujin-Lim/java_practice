// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
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


