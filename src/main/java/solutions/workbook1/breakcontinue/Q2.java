package main.java.solutions.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 짝수이면 건너뛰기
            if (i % 2 == 0) {
                continue;
            }

            // 홀수만 출력
            System.out.print(i + " ");
        }
    }
}
