package main.java.solutions.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // do-while 문으로 3의 배수의 합 계산 후 출력
        int sum = 0;    // 3의 배수 합을 저장할 변수
        int i = 3;      // 첫 번째 3의 배수부터 시작

        do {
            if (i <= n) {   // i가 n 이하일 때만 합산
                sum += i;
            }
            i += 3;         // 다음 3의 배수로 이동
        } while (i <= n);   // i가 n보다 클 때까지 반복

        System.out.println(sum);
        sc.close();
    }
}

/**
 * **코드 설명:**
 * 1. **변수 초기화**:
 *     - `sum = 0`: 3의 배수들의 합을 저장할 변수
 *     - `i = 3`: 첫 번째 3의 배수인 3부터 시작
 *
 * 2. **do-while 구조**:
 *     - `do { ... }`: 조건과 관계없이 최소 한 번은 실행
 *     - `while (i <= n)`: i가 n보다 작거나 같을 때까지 반복
 *
 * 3. **루프 내부**:
 *     - `if (i <= n)`: i가 n 이하일 때만 합산 (범위 체크)
 *     - `sum += i`: 현재 3의 배수를 합에 더함
 *     - `i += 3`: 다음 3의 배수로 이동 (3, 6, 9, 12, ...)
 *
 * 4. **결과 출력**:
 *     - 3의 배수들의 합을 출력
 *
 * **실행 예시 (N=10):**
 * - **3의 배수**: 3, 6, 9 (12는 10을 초과하므로 제외)
 * - **계산**: 3 + 6 + 9 = 18
 * - **출력**: `18`
 */
