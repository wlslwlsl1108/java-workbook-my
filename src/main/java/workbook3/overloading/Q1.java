package main.java.workbook3.overloading;

import java.util.Scanner;

public class Q1 {
    // TODO: printValue 오버로딩 (int), (double), (String)
    static void printValue(int i){
        System.out.println(i);
    }
    static void printValue(double d){
        System.out.println(d);
    }
    static void printValue(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        // TODO: printValue (int), (double), (String) 메서드 작성 후 아래 주석 해제
        printValue(i);
        printValue(d);
        printValue(s);
    }
}
