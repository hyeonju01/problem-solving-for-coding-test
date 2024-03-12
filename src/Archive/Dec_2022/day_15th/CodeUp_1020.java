package Archive.Dec_2022.day_15th;

import java.util.Scanner;
/*
1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
 */
public class CodeUp_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RRN = sc.next();
        String[] splitted = RRN.split("-");
        String birthDay = splitted[0]; //000907은 int 자료형으로 처리할 경우 907만 남는다. 그래서 String 자료형으로 처리한다.
        int BackCodes= Integer.parseInt(splitted[1]);
        System.out.printf("%s%d",birthDay,BackCodes);
    }
}
