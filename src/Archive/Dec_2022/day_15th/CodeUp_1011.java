package Archive.Dec_2022.day_15th;

import java.util.Scanner;

//메모리 14280, 시간 111, 코드길이 223B

public class CodeUp_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        char 자료형을 스캐너로 입력받을 때,
        next()를 통해 String 자료형을 입력받은 후
        0번째 글자를 char로 바꿔주는 charAt() 함수를 사용한다.
         */
        char x = sc.next().charAt(0);
        System.out.println(x);
    }
}
