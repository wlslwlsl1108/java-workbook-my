package main.java.workbook1.loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 홀수 합 계산 (1부터 시작하여 2씩 증가)
        int oddSum = 0;
        for (int i = 1; i <= n; i += 2) {
            oddSum += i;
        }

        // 짝수 합 계산 (2부터 시작하여 2씩 증가)
        int evenSum = 0;
        for (int i = 2; i <= n; i += 2) {
            evenSum += i;
        }

        System.out.println(oddSum + " " + evenSum);
        sc.close();
    }
}
