package Archive.Nov_2023.day_21st.코딩테스트_입문;

import java.util.Scanner;
public class 직각삼각형_출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1 ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
