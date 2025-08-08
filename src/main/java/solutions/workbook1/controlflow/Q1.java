package main.java.solutions.workbook1.controlflow;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;    // 짝수의 합
        int product = 1; // 홀수의 곱

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // 짝수인 경우 합에 더함
                sum += i;
            } else {
                // 홀수인 경우 곱에 곱함
                product *= i;
            }
        }

        System.out.println(sum + " " + product);
        sc.close();
    }
}
