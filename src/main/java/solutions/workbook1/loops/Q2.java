package main.java.solutions.workbook1.loops;

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

/**
 * **코드 설명:**
 * 1. **홀수 합 계산**:
 *     - `for (int i = 1; i <= n; i += 2)`: i가 1부터 시작하여 2씩 증가 (1, 3, 5, 7, ...)
 *     - 자동으로 홀수만 선택되어 합산됨
 *
 * 2. **짝수 합 계산**:
 *     - `for (int i = 2; i <= n; i += 2)`: i가 2부터 시작하여 2씩 증가 (2, 4, 6, 8, ...)
 *     - 자동으로 짝수만 선택되어 합산됨
 *
 * 3. **결과 출력**:
 *     - 홀수 합과 짝수 합을 공백으로 구분하여 출력
 *
 * **실행 예시 (N=6):**
 * - **홀수**: 1 + 3 + 5 = 9
 * - **짝수**: 2 + 4 + 6 = 12
 * - **출력**: `9 12`
 */