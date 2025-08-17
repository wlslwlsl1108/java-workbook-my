package main.java.workbook2.classdesign;

import java.util.Scanner;

class Point {
    double x;
    double y;
    // TODO: 생성자 및 distanceTo 메서드 작성
    // 생성자 //
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    // distanceTo 메서드 작성 //
    void distanceTo(Point p) {
        System.out.println(Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y)));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        // TODO: 생성자 작성 후 주석 해제
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        // TODO: p1.distanceTo(p2) 출력
        p1.distanceTo(p2);
    }
}