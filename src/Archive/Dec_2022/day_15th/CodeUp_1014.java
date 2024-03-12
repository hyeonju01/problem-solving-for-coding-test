package Archive.Dec_2022.day_15th;

import java.util.Scanner;
/*
1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기
 */
public class CodeUp_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);
        System.out.printf("%c %c", y, x);
    }
}
