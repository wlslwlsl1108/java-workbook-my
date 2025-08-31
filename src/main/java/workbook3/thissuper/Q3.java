package main.java.workbook3.thissuper;

import java.util.Scanner;

class Animal {                                          // 부모 클래스
    String name;                                        // 인스턴스 필드 name

    Animal(String name) {                               // 부모 생성자 정의 -> Animal
        System.out.println("Animal constructor");       // Animal constructor 출력
        this.name = name;                               // 전달받은 name 으로 필드 name 초기화
    }
}

class Dog extends Animal/* TODO: Animal 클래스 상속 */ {  // 자식 클래스 (Animal 상속)
    Dog(String name) {                                  // 자식 생성자 정의 -> Dog
        // TODO: super() 호출
        super(name);                                    // name 필드를 가진 부모 생성자 호출
        System.out.println("Dog constructor");          // Dog constructor 출력
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 입력 받기
        String n = sc.next();                           // 문자열 입력
         Dog dog = new Dog(n);                          // Dog 객체 생성하여 dog가 참조
         // TODO: Dog 클래스 완성 후 아래 주석 해제
         System.out.println(dog.name);                  // dog가 참조하는 name 출력
    }                                                   // Dog 객체 호출 시 super로 인해 부모생성자 먼저 호출 후 자식생성자 호출
}