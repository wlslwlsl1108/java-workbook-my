package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {          // 행을 담당 (곱해지는 수: 1~9)
            for (int j = 2; j <= 9; j++) {      // 열을 담당 (단수: 2~9)
                System.out.print(j + "*" + i + "=" + (j * i));

                if (j < 9) {                    // 마지막 열이 아니면 공백 추가
                    System.out.print(" ");
                }
            }
            System.out.println();              // 한 행이 끝나면 줄바꿈
        }

    }
}