package main.java.workbook3.varinit;

import java.util.Scanner;

class BankAccount {                               // BankAccount 클래스
    static {                                      // static 초기화 블록
        // TODO: 은행 이름 출력
        System.out.println("Bank Opened");        // 은행 이름 출력 (클래스 로딩 시 1회만)
    }
    {                                             // 인스턴스 초기화 블록
        // TODO: 계좌 개설 메시지 출력
        System.out.println("Account Created");    // 계좌 개설 메세지 출력 (객체 생성시마다 출력)
    }
    int balance;                                  // 잔액 저장할 인스턴스 변수 선언
    BankAccount(int balance) {                    // 생성자 정의
        this.balance = balance;                   // 전달받은 balance 값으로 잔액 초기화
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Scanner 생성
        int b1 = sc.nextInt();                     // 첫 번째 계좌 금액 입력
        int b2 = sc.nextInt();                     // 두 번째 계좌 금액 입력
        BankAccount a1 = new BankAccount(b1);      // b1을 전달받아 balance가 b1인 BankAccount 객체를 생성하고, a1이 참조
        BankAccount a2 = new BankAccount(b2);      // b2을 전달받아 balance가 b2인 BankAccount 객체를 생성하고, a2가 참조
        System.out.println(a1.balance);            // a1이 참조하는 잔액 출력 -> a1 계좌 잔액 출력
        System.out.println(a2.balance);            // a2이 참조하는 잔액 출력 -> a2 계좌 잔액 출력
    }
}