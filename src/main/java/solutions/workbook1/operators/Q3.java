package main.java.solutions.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // x > y 결과와 !(x > y) 결과 출력
        boolean comparison = x > y; // 비교 연산 결과
        boolean notComparison = !comparison; // 논리 NOT 연산 결과

        System.out.println(comparison + " " + notComparison);

        sc.close();

    }
}