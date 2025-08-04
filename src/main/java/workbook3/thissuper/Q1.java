package main.java.workbook3.thissuper;

import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        // TODO: this 사용해 초기화
    }
    void printInfo() {
        // TODO: this를 사용하여 필드 출력
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = sc.nextInt();
        Person p = new Person(n, a);
        p.printInfo();
    }
}