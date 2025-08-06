package main.java.solutions.workbook1.operators;

import java.util.Scanner;

/**
 * 복합 대입 연산자 (`+=`)
 * `a += b * c`는 `a = a + (b * c)`와 동일한 의미
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a += b * c 연산 후 a, b, c 출력
        a += b * c;  // 복합 대입 연산자 사용

        System.out.println(a + " " + b + " " + c);

        sc.close();

    }
}
