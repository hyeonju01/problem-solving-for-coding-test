package Archive.Dec_2023.day_7th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * https://www.acmicpc.net/problem/9935
 */

public class 문자열_폭발 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String flareStr = br.readLine();

        String[] strArr = str.split("");
        String[] flareStrArr = flareStr.split("");

        String firstWord = flareStrArr[0];

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!strArr[i].equals(firstWord)) {
                arr.add(String.valueOf(str.charAt(i)));
            } else {

            }
        }

        System.out.println(arr);

        if (str.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(str);
        }

    }
}