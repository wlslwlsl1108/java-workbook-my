package main.java.workbook3.constructor;

import java.util.Scanner;

class Student {
    String name;
    Student() {
        // TODO: name 초기화
    }
    Student(String name) {
        // TODO: name 초기화
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Student s1 = new Student();
        Student s2 = new Student(name);
        // TODO: s1.name과 s2.name 출력
    }
}
