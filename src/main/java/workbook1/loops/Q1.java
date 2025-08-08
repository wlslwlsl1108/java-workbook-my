package main.java.workbook1.loops;

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
