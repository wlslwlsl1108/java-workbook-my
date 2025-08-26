package main.java.workbook3.varinit;

public class Q3 {
    static int s;
    int i;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q3() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("static variable");
        Q3 obj = new Q3();
        System.out.println("instance variable");
    }
}
/*
    [ 실행 순서 ]

    1. 클래스 로딩 시점 -> static 변수/블록 실행 (1번만)
        1) static 변수
        2) static 변수  => "static block"

    2. main 메서드 실행
        - 첫줄 출력문 실행 => "static variable"

    3. 객체 생성 (new Q3())
        1) 인스턴스 변수/블록 실행 => "instance block"
        2) 생성자 실행 => "constructor"

    4. main 메서드 이어서 실행
        - 다음 출력문 실행 => "instance variable"

    ex. Q3 obj1 = new Q3();
        System.out.println("instance variable"); 2번 하는 경우

        => static block
           static variable
           instance block
           constructor
           instance variable
           instance block
           constructor
           instance variable
 */