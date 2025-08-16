package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    // TODO: 생성자 및 addSeconds 메서드 작성
    // 생성자 //
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //메서드
    int addSeconds(int addsecond) {
        second += addsecond;
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
            if (minute >= 60) {
                hour += minute / 60;
                minute %= 60;
                if (hour >= 24) {
                    hour -= 24;
                }
            }
        }
        return hour + minute + second;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();

        Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
        time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제
        // TODO: time.hour time.minute time.second 출력
        System.out.println(time.hour +  " " + time.minute + " " + time.second);
    }
}