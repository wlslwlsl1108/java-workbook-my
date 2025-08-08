package main.java.solutions.workbook1.controlflow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0; // 양수의 합

        while (true) {
            int number = sc.nextInt();

            // 0이 입력되면 반복 종료
            if (number == 0) {
                break;
            }

            // 양수인 경우에만 합에 더함
            if (number > 0) {
                sum += number;
            }
            // 음수인 경우는 무시
        }

        System.out.println(sum);
        sc.close();
    }
}