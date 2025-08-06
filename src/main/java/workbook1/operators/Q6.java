package main.java.workbook1.operators;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // TODO: x와 y 중 큰 값에 5를 곱해 출력
        int result = (x > y ? x : y); // 삼항 연산자 사용하여 result에 큰 값 저장
        result *= 5; // 선택 된 값에 5 곱해 줌

        System.out.println(result); // 최종 결과값 출력

        }
    }
