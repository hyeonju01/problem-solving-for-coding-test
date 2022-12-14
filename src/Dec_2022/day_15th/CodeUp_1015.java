package Dec_2022.day_15th;

//1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)

import java.util.Scanner;

public class CodeUp_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.printf("%.2f", num); //printf의 지시자를 이용하여 반올림하기
    }
}
