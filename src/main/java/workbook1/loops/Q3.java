package main.java.workbook1.loops;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // do-while 문으로 3의 배수의 합 계산 후 출력
        int sum = 0;    // 3의 배수 합을 저장할 변수
        int i = 3;      // 첫 번째 3의 배수부터 시작

        do {
            if (i <= n) {   // i가 n 이하일 때만 합산
                sum += i;
            }
            i += 3;         // 다음 3의 배수로 이동
        } while (i <= n);   // i가 n보다 클 때까지 반복

        System.out.println(sum);
        sc.close();
    }
}
