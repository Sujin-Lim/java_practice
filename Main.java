// 올릴 때 Main 으로 해야 함. 연습하는 곳임

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<String>> arr = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            String line = in.nextLine();
            List<String> row = new ArrayList<>();
            String[] values = line.split(" ");
            for (String value : values) {
                row.add(value);
            }
            arr.add(row);
        }

        int numRows = arr.size();
        int numCols = arr.get(0).size();

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }

    }
}


