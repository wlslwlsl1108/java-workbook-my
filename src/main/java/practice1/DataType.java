package main.java.practice1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DataType {
    public static void main(String[] args) {
        // [자료형]
        // 1. 문자형 연습
        char ch1 = 'A';
        System.out.println(ch1);  // 문자출력
        System.out.println((int)ch1);  // 문자에 해당하는 아스키 코드값 출력

        char ch2 = 66;
        System.out.println(ch2); // ch2의 자료형이 char 이기 때문에 "B" 출력

        int ch3 = 67;
        System.out.println(ch3); // ch3 자료형 int -> 67 출력
        System.out.println((char)ch3); // char 형태로 출력 -> "C" 출력


        // [이론 정리]
        /*
           # 정수 자료형
              - byte  (1바이트 = 8비트)
              - short  (2바이트)
              - int  (4바이트)
              - long  (8바이트)
                  -> long은 int형으로 기본 처리
                  -> int 범위 넘는 숫자는 뒤에 L 붙여줘야 함

           # 문자 자료형
              - 인코딩 : 문자 -> 코드값 변환
              - 디코딩 : 코드값 -> 문자 변환

           # 작은 따옴표
              - 문자 사용 시

           # 큰 따옴표
              - 문자열(String) 사용 시

           # 변수명 조건  -> // FIXME : 특징적인 변수명 사용하기
              1. 영문자 / 숫자 사용
              2. 숫자 시작 불가
              3. 예약어 사용 불가
              4. 카멜 표기법 사용 권장 (첫글자는 소문자)

         */

    }
}
