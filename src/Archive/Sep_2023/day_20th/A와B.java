package Archive.Sep_2023.day_20th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A와B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while (T.length() > S.length()) {
            if (T.charAt(T.length()-1)=='A') {
                T.delete(T.length()-1, T.length()); // 마지막 글자 삭제
            } else if (T.charAt(T.length()-1)=='B') {
                T.delete(T.length()-1, T.length());
                T.reverse();
            }
        }

        if (T.toString().equals(S.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}