package Dec_2022.day_15th;

import java.util.Scanner;
/*
1018 : [기초-입출력] 시간 입력받아 그대로 출력하기(설명)
 */
public class CodeUp_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] a = time.split(":");
        int hour = Integer.parseInt(a[0]);
        int minute = Integer.parseInt(a[1]);
        System.out.printf("%d:%d",hour,minute);
    }
}
