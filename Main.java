// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ;
        int result = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
