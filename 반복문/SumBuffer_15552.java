// TODO: 2023-05-17
// 15552. Scanner, println대신 BufferedReader, BufferedWriter 사용 모르겠는데?


package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class SumBuffer_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            String line = reader.readLine();
            String[] numbers = line.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            writer.write(String.valueOf(a + b));
            writer.newLine();
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}