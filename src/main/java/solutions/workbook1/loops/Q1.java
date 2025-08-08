package main.java.solutions.workbook1.loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // while 문을 이용하여 1부터 n까지의 합 출력
        int sum = 0;    // 합을 저장할 변수
        int i = 1;      // 반복 변수 (1부터 시작)

        while (i <= n) {
            sum += i;   // 현재 i 값을 sum에 더함
            i++;        // 반복 변수 증가
        }

        System.out.println(sum);  // 결과 출력
        sc.close();
    }
}

/**
 * **코드 설명:**
 * 1. **변수 초기화**:
 *     - `sum = 0`: 합을 저장할 변수
 *     - `i = 1`: 반복 변수 (1부터 시작)
 *
 * 2. **while 루프 조건**:
 *     - `i <= n`: i가 n보다 작거나 같을 때까지 반복
 *
 * 3. **루프 내부**:
 *     - `sum += i`: 현재 i 값을 sum에 더함
 *     - `i++`: 반복 변수를 1씩 증가
 *
 * 4. **결과 출력**:
 *     - 루프가 끝나면 `sum`에 1부터 n까지의 합이 저장됨
 *
 * **실행 예시:**
 * - 입력: `10`
 * - 과정: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
 * - 출력: `55`
 */

