// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] lines = new String[5];

        for (int i = 0; i < 5; i++) {
            lines[i] = in.nextLine();
        }
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < lines[i].length()) {
                    result.append(lines[i].charAt(j));
                }
            }
        }
        System.out.println(result.toString());
    }
}


