package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `3.14`
 *  - `intValue = (int) 3.14 = 3`
 *  - `difference = 3.14 - 3 = 0.14`
 *  - 출력: `0.14`
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        // d를 int로 강제 형변환
        int intValue = (int) d;

        // 원래 값에서 강제 형변환한 값을 빼서 차이 계산
        double difference = d - intValue;

        // 결과 출력
        System.out.println(difference);

    }
}

/**
 * **해설:**
 * 1. `double d = sc.nextDouble();` - 사용자로부터 실수값을 입력받습니다.
 * 2. `int intValue = (int) d;` - `double` 값을 `int`로 강제 형변환합니다. 이때 소수부는 버려집니다.
 *     - 예: 3.14 → 3
 *
 * 3. `double difference = d - intValue;` - 원래 값에서 강제 형변환한 값을 빼서 차이(소수부)를 계산합니다.
 *     - 예: 3.14 - 3 = 0.14
 *
 * 4. `System.out.println(difference);` - 계산된 차이를 출력합니다.
 *
 * **실행 예시:**
 * - 입력: `3.14`
 * - `intValue = (int) 3.14 = 3`
 * - `difference = 3.14 - 3 = 0.14`
 * - 출력: `0.14`
 */