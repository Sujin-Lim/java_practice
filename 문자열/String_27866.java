// TODO: 2023-05-19
// 27866. 단어 s와 정수 i가 주어졌을 때, s의 i번째 글짜 출력.

package 문자열;

import java.util.Scanner;

public class String_27866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int i = in.nextInt();
        char j = s.charAt(i-1);
        System.out.println(j);
    }
}