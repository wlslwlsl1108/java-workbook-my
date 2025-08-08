package main.java.solutions.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            // 10의 배수를 만나면 반복 종료
            if (i % 10 == 0) {
                break;
            }

            // 10의 배수가 아닌 수들을 합산
            sum += i;
        }

        System.out.println(sum);

    }
}