package main.java.solutions.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            // 40 이상이면 반복문 종료
            if (i >= 40) {
                break;
            }

            // 3의 배수가 아니면 건너뛰기
            if (i % 3 != 0) {
                continue;
            }

            // 5의 배수이면 건너뛰기 (3의 배수이면서 5의 배수가 아닌 수만 처리)
            if (i % 5 == 0) {
                continue;
            }

            // 조건을 만족하는 수를 합산
            sum += i;
        }

        System.out.println(sum);
    }
}