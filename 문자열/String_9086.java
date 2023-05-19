// TODO: 2023-05-19
// 9086. 테스트 케이스의 갯수 t, 문자열 입력 시 첫 글자와 마지막 글자 출력

package 문자열;

import java.util.Scanner;

public class String_9086 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i = 0;
        for (int j = 0; j < t; j++) {
            String a = in.next();
            System.out.print(a.charAt(0));
            System.out.println(a.charAt(a.length()-1));
        }
    }
}