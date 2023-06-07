// 230608
// 10798. 총 다섯줄 입력 주어짐. 각 줄에는 1~15개 글자가 주어짐. 세로로 읽어서 출력


package 일차원배열;

import java.util.Scanner;

public class Vertical_10798 {
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