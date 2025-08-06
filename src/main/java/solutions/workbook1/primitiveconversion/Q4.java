package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `2.5 3.7`
 *  - `intValue = (int) 2.5f = 2`
 *  - `doubleValue = (double) 3.7f = 3.7`
 *  - `sum = 2 + 3.7 = 5.7`
 *  - 출력: `5.7`
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();

        // f1을 int로 강제 형변환 (소수부 제거)
        int intValue = (int) f1;

        // f2를 double로 자동 형변환 (부동소수점 정밀도 문제 발생 이해하기)
        double doubleValue = f2;

        // 두 값의 합을 계산 (int가 자동으로 double로 변환됨)
        double sum = intValue + doubleValue;

        // 결과 출력
        System.out.println(sum);

    }
}
