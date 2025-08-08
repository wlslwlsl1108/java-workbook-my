package main.java.solutions.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;

                // 곱셈 결과가 30 이상이면 건너뛰기
                if (result >= 30) {
                    continue;
                }

                // 30 미만인 경우만 출력
                System.out.print(i + "*" + j + "=" + result + " ");
            }
            System.out.println(); // 각 단이 끝나면 줄바꿈
        }
    }
}
