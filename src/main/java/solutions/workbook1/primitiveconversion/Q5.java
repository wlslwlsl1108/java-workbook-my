package main.java.solutions.workbook1.primitiveconversion;

import java.util.Scanner;

/**
 * 실행 예시:
 *  - 입력: `3.8 4.2 5.9`
 *  - `intX = (int) 3.8 = 3`
 *  - `intY = (int) 4.2 = 4`
 *  - `intZ = (int) 5.9 = 5`
 *  - `sum = 3 + 4 + 5 = 12`
 *  - `average = (float) 12 / 3 = 4.0`
 *  - 출력: `4.0`
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // 각각을 int로 강제 형변환 (소수부 제거)
        int intX = (int) x;
        int intY = (int) y;
        int intZ = (int) z;

        // 세 값의 합을 구하고 평균 계산
        int sum = intX + intY + intZ;
        float average =  (float) sum / 3;
        // sum이 3으로 나누어 떨어지지 않는 경우 생각해보기!
        // 형변환 시점이 중요, 연산 순서에 따라 결과가 달라질 수 있다.

        // 결과 출력
        System.out.println(average);

    }
}
