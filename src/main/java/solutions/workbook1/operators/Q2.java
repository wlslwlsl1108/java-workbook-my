package main.java.solutions.workbook1.operators;

import java.util.Scanner;

/**
 * 예시 실행:
 *  - 입력: `5`
 *  - 전위 증가: `++num1` → 6 (먼저 증가 후 반환)
 *  - 후위 증가: `num2++` → 5를 반환하지만, 연산 후 `num2`는 6
 *  - 출력: `6 6`
 *
 *  핵심 개념:
 *  - 전위 증가 (`++i`): 증가 → 값 사용
 *  - 후위 증가 (`i++`): 값 사용 → 증가
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 전위 증가와 후위 증가 결과 출력
        int num1 = num;  // 전위 증가용 변수
        int num2 = num;  // 후위 증가용 변수

        int preIncrement = ++num1;   // 전위 증가: 먼저 증가한 후 값 반환
        int postIncrement = num2++;  // 후위 증가: 현재 값 반환 후 증가
        // System.out.println(postIncrement); // 5 출력

        int finalNum2 = num2; // 후위 증가 후의 변수 값
        System.out.println(preIncrement + " " + finalNum2);

        sc.close();



    }
}
