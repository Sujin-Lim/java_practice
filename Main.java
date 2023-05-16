// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b && b == c) {
            System.out.print(10000 + (a * 1000));
        } else if (a==b) {
            System.out.print(1000 + (a * 100));
        } else if (b==c) {
            System.out.print(1000 + (b * 100));
        } else if (a == c) {
            System.out.print(1000 + (c * 100));
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.print(a * 100);
                } else {
                    System.out.println(c * 100);
                }
            } else {
                if (b > c) {
                    System.out.println(b * 100);
                } else {
                    System.out.println(c * 100);
                }
            }

        }


    }
}
