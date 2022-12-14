package Dec_2022.day_15th;

import java.util.Arrays;
import java.util.Scanner;
/*
1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
 */
public class CodeUp_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fulldate = sc.next();
        String[] dates = fulldate.split("\\."); //dot을 정규표현식으로 표현하려면 이렇게 백슬래쉬 두 번을 써주기.
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day); //연도를 99로 입력하면 0099로 출력되게 해야한다네..
    }
}
