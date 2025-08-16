package main.java.workbook2.classdesign;

import java.util.Scanner;

class Circle {
    double r;

    // TODO: 생성자 작성
    Circle(double r) {
        this.r = r;
    }

    double getCircumference() {
        // TODO: 둘레 반환
        return Math.PI * 2 * r;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        // TODO: 생성자 작성 후 주석 해제
        Circle c = new Circle(radius);

        // TODO: c.getCircumference() 출력
        System.out.println(c.getCircumference());
    }
}
