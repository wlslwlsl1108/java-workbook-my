package main.java.solutions.workbook1.controlflow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int positiveCount = 0;  // 양수의 개수
        int negativeSum = 0;    // 음수의 합

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();

            if (number > 0) {
                // 양수인 경우 개수 증가
                positiveCount++;
            } else if (number < 0) {
                // 음수인 경우 합에 더함
                negativeSum += number;
            }
            // 0인 경우는 양수도 음수도 아니므로 처리하지 않음
        }

        System.out.println(positiveCount + " " + negativeSum);
        sc.close();
    }
}