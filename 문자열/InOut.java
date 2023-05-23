// TODO: 2023-05-23
// 11718. 입력 받은 대로 출력. 입력 최대 100줄

package 문자열;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
//        hasNextLine() : 현재 입력 대상에 다음에 읽을 줄이 있는지 확인. 쓰지 않으면 런타임에러(NoSuchElement)
        while(a < 100 && in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
            a++;
        }
    }
}
