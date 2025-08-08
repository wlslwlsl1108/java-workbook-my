package main.java.solutions.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean first = true; // 첫 번째 소수인지 확인용 (공백 출력 제어)

        // 2부터 n까지 확인 (1은 소수가 아님)
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // 현재 수가 소수인지 판단

            // 2부터 i-1까지 나누어 떨어지는지 확인
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // 약수가 있으므로 소수가 아님
                    break; // 더 이상 확인할 필요 없음
                }
            }

            // 소수인 경우 출력
            if (isPrime) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
            }
        }

        System.out.println();
        sc.close();
    }
}