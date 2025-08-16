package main.java.workbook2.classdesign;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Account {
    String accountNo;
    int balance;
    // TODO: 생성자, deposit, withdraw 메서드 작성
    // 생성자 //
    Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    //deposit 메서드 -> 입금//
    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    //withdraw 메서드 -> 출금//
    boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        } else{
            balance -= amount;
            return true;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNo = sc.next();
        int bal = sc.nextInt();
        Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제

        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        if (cmd1.equals("deposit")) {
            acc.deposit(amt1); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
            acc.withdraw(amt1); // TODO: withdraw 메서드 작성 후 주석 해제
        }

        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) {
            acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
            acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제
        }

    }
}