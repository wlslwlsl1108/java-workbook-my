package main.java.solutions.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 산술 연산자(+, -, *, /, %) 결과 출력
        int add = a + b;      // 덧셈
        int sub = a - b;      // 뺄셈
        int mul = a * b;      // 곱셈
        int div = a / b;      // 나눗셈 (정수 부분만)
        int mod = a % b;      // 나머지

        System.out.println(add + " " + sub + " " + mul + " " + div + " " + mod);

        sc.close();

    }
}