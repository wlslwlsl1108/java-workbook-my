package main.java.workbook1.operators;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // TODO: 산술 연산자(+, -, *, /, %) 결과 출력

        int sum = a + b; // + 결과값
        int sub = a - b; // - 결과값
        int mul = a * b; // * 결과값
        int div = a / b; // / 결과값
        int mod = a % b; // % 결과값

        System.out.println(sum + " " +  sub + " " + mul + " " + div + " " + mod);
        // 각 결과는 공백으로 구분하여 한 줄에 출력
    }
}