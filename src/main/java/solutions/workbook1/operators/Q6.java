package main.java.solutions.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // x와 y 중 큰 값에 5를 곱해 출력
        int result = (x > y ? x : y) * 5;
        System.out.println(result);

        // 2중 삼항 연산자 = 조건1 ? 값1 : (조건2 ? 값2 : 값3)
        /**
         *         int a = sc.nextInt();
         *         int b = sc.nextInt();
         *         int c = sc.nextInt();
         *
         *         // 2중 삼항 연산자로 세 수 중 최댓값 찾기
         *         int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
         *         System.out.println("최댓값: " + max);
         */

        sc.close();

    }
}
