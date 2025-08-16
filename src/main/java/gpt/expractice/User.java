package main.java.gpt.expractice;

public class User {
    // [ 클래스와 객체 기본 ] 연습예제1. User 클래스 만들기

    // 필드 (속성)
    private String name;
    private int age;

    // 생성자 (객체 생성 시 초기화)
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드 (기능)
    public void introduce() {
        System.out.println("안녕하세요. 저는" + name + "이고, " + age + "살입니다.");
    }

    public void changeName(String newName){
        this.name = newName;
    }

}
