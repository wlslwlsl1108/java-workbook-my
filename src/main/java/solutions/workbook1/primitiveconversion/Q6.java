package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `100 50`
 *  - `num1 = Integer.parseInt("100") = 100`
 *  - `num2 = Integer.parseInt("50") = 50`
 *  - `difference = 100 - 50 = 50`
 *  - `result = (byte) 50 = 50`
 *  - 출력: `50`
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // 문자열을 int로 변환
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        // 두 수의 차이 계산
        int difference = num1 - num2;

        // 차이를 byte로 강제 형변환, byte의 범위는 -128~127, 범위가 벗어나는 값은 오버플로우가 발생할 수 있다는 점!
        byte result = (byte) difference;

        // 결과 출력
        System.out.println(result);

    }
}
