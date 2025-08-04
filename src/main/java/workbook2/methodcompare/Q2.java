package main.java.workbook2.methodcompare;

import java.util.Scanner;

class MathUtil {
    static int square(int n) {
        // TODO: n의 제곱 반환
        return 0;
    }
    int cube(int n) {
        // TODO: n의 세제곱 반환
        return 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = MathUtil.square(n);
        MathUtil util = new MathUtil();
        int cu = util.cube(n);
        // TODO: sq와 cu 출력
    }
}
