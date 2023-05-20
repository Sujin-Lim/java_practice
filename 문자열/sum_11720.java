// TODO: 2023-05-20
// 11720. 첫째줄에 숫자의 개수 n, 둘째줄에 숫자 n이 공백없이 입력. n의 값 더해서 출력

package 문자열;

import java.util.Scanner;

public class sum_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            charAt(): 문자열에서 인덱스 i의 해당하는 위치의 문자 가져옴.
//             Character.getNumericValue(): 해당 문자의 수치 값 반환. 숫자는 숫자 반환, 다른 문자는 -1 반환
            int s = Character.getNumericValue(a.charAt(i));
            sum += s;
        }
        System.out.println(sum);
    }
}