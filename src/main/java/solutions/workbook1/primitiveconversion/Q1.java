package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `3 4`
 *  - 과정: 3 + 4 = 7.0 (double) → 7 (int)
 *  - 출력: `7`
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a와 b를 double로 자동 형변환하여 더한 뒤 int로 강제 변환하여 출력
        double sum = a + b;  // int → double 자동 형변환, 정수형 변수 a, b가 double 타입 변수에 할당되면서 자동으로 실수형으로 변환됩니다.
        int result = (int) sum;  // double → int 강제 형변환, 캐스팅 연산자를 사용하여 double 타입을 int 타입으로 강제 변환합니다.

        System.out.println(result);

        sc.close();
    }
}
