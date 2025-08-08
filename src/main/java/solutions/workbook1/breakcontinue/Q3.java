package main.java.solutions.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();

            // 음수가 입력되면 반복 종료
            if (num < 0) {
                break;
            }

            // 양수인 경우 합계와 개수 증가
            sum += num;
            count++;
        }

        // 평균 계산 및 출력
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        }

        sc.close();
    }
}