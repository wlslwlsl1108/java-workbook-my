package main.java.workbook1.operators;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        // TODO: x &gt; y 결과와 !(x &gt; y) 결과 출력

        boolean isGreater = (x > y); // 첫번째 값이 두번째 값보다 큰지 비교 (비교 연산자 : >)
        boolean isNotGreater = !(x > y); // 논리 NOT 연산 적용 (논리 연산자 : !)

        System.out.println(isGreater + " " + isNotGreater);
    }
}