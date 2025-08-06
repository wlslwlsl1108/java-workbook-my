package main.java.solutions.workbook1.conditionals;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a, b, c 중 최대값 또는 같은 값 여부 출력
        if (a == b || b == c || a == c) {
            System.out.println("같은 수 존재");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            } else {
                if (b > c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
        }

        sc.close();

    }
}