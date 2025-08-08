package main.java.workbook1.loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        // 역삼각형 패턴 출력
        for (int i = 0; i < h; i++) {           // 행을 담당하는 외부 반복문 (H번 반복)
            for (int j = 0; j < h - i; j++) {   // 열을 담당하는 내부 반복문 (별의 개수만큼 반복)
                System.out.print("*");         // 별 출력 (줄바꿈 없이)
            }
            System.out.println();              // 한 행이 끝나면 줄바꿈
        }

        sc.close();
    }
}
