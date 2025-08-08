package main.java.solutions.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // i + j == 6이면 위치 출력 후 라벨 break
                if (i + j == 6) {
                    System.out.println("(" + i + "," + j + ")");
                    break outer;
                }
            }
        }
    }
}

/**
 * 1. **라벨 정의**: `outer:`로 외부 반복문에 라벨을 지정합니다.
 * 2. **중첩 반복문**:
 *     - 외부: `for (int i = 1; i <= 5; i++)` - 행 1부터 5까지
 *     - 내부: `for (int j = 1; j <= 5; j++)` - 열 1부터 5까지
 *
 * 3. **조건 확인**: `if (i + j == 6)` - 행과 열의 합이 6인지 확인합니다.
 * 4. **위치 출력**: 조건을 만족하면 `(행,열)` 형태로 위치를 출력합니다.
 * 5. **라벨 break**: `break outer;`로 외부 반복문까지 한 번에 종료합니다.
 *
 * - 일반적인 `break`는 가장 가까운 반복문(내부 반복문)만 종료하지만, 라벨을 사용한 `break outer;`는 `outer` 라벨이 붙은 외부 반복문까지 한 번에 종료합니다.
 * - 행+열=6인 첫 번째 위치는 (1,5)이므로, 이 지점에서 전체 탐색이 종료됩니다.
 */