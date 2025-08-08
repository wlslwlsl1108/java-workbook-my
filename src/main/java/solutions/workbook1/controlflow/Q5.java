package main.java.solutions.workbook1.controlflow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 한 자리 수가 될 때까지 반복
        while (num >= 10) {
            int sum = 0; // 각 자리수의 합

            // 현재 숫자의 각 자리수를 더함
            while (num > 0) {
                sum += num % 10; // 마지막 자리수 추출하여 더함
                num /= 10;       // 마지막 자리수 제거
            }

            num = sum; // 다음 반복을 위해 합을 num에 저장
        }

        System.out.println(num);
        sc.close();
    }
}

/**
 * **코드 설명:**
 * 1. **외부 while문**: `num >= 10`인 동안 반복 (한 자리 수가 될 때까지)
 * 2. **내부 while문**: 현재 `num`의 각 자리수를 추출하여 합 계산
 *     - `num % 10`: 마지막 자리수 추출
 *     - `num /= 10`: 마지막 자리수 제거
 *     - `sum += 추출한 자리수`: 합에 더함
 *
 * 3. **반복 과정**: 계산된 합을 다시 `num`에 저장하여 다음 반복 진행
 * 4. **종료 조건**: `num < 10`이 되면 한 자리 수이므로 반복 종료
 *
 * **예시 실행 (입력: 9875):**
 * 1. **첫 번째 반복** (num = 9875):
 *     - 5 + 7 + 8 + 9 = 29
 *     - num = 29
 *
 * 2. **두 번째 반복** (num = 29):
 *     - 9 + 2 = 11
 *     - num = 11
 *
 * 3. **세 번째 반복** (num = 11):
 *     - 1 + 1 = 2
 *     - num = 2
 *
 * 4. **종료**: num = 2는 한 자리 수이므로 반복 종료
 *
 * 최종 결과: `2`
 * **참고**: 이 과정을 "디지털 루트(Digital Root)" 또는 "반복 디지털 합"이라고 부르기도 합니다.
 */