package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `1 2 3 4`
 *  - `b = 1 (byte)`, `s = 2 (short)`, `i = 3 (int)`, `l = 4 (long)`
 *  - `sum = 1L + 2L + 3L + 4L = 10L`
 *  - `result = (float) 10L = 10.0f`
 *  - 출력: `10.0`
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        short s = sc.nextShort();
        int i = sc.nextInt();
        long l = sc.nextLong();

        // 모든 값을 long으로 자동 형변환하여 합산
        long sum = b + s + i + l;

        // 결과를 float으로 자동 형변환하여 출력
        float result = sum;
        System.out.println(result);

    }
}
