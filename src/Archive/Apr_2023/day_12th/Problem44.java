package Archive.Apr_2023.day_12th;

import java.util.Scanner;

/**
 *  [Programmers] 직각삼각형 출력하기
 *
 */
public class Problem44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
