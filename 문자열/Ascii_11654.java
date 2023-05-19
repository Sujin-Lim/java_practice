// TODO: 2023-05-19
// 11654. 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

package 문자열;

import java.util.Scanner;

public class Ascii_11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // in.next()는 string을 받기 때문에, 한 글자만 입력이라면 아래처럼 첫번째자리만 받는다고 charAt 메서드를 써야 함.
        char a = in.nextLine().charAt(0);
        // int로 강제 변환하면 바로 아스키코드값이 나옴..
        System.out.println((int)a);

    }
}