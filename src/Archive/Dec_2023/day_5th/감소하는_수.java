package Archive.Dec_2023.day_5th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  2023. 12. 5. / Tue
 *  미해결
 */
public class 감소하는_수 {
    public static void main(String[] args) throws IOException {

        int[] one_digit_num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // input < 100_0000, 정수 X
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();
        int intX = Integer.parseInt(X);

        int idx = 10;

        String[] arr;
        int answer = 0;

        if (intX >= 0 && intX <=9) {
            answer = one_digit_num[intX];
        } else {
            while (idx < intX) {
                System.out.println("idx: "+ idx);
                String idx_str = String.valueOf(idx);
                arr = idx_str.split("");
                int arrLength = arr.length;
                switch (arrLength) {
                    case 2:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])
                            && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])
                            && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])
                            && Integer.parseInt(arr[2]) > Integer.parseInt(arr[3])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])
                            && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])
                            && Integer.parseInt(arr[2]) > Integer.parseInt(arr[3])
                            && Integer.parseInt(arr[3]) > Integer.parseInt(arr[4])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])
                            && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])
                            && Integer.parseInt(arr[2]) > Integer.parseInt(arr[3])
                            && Integer.parseInt(arr[3]) > Integer.parseInt(arr[4])
                            && Integer.parseInt(arr[4]) > Integer.parseInt(arr[5])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])
                            && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])
                            && Integer.parseInt(arr[2]) > Integer.parseInt(arr[3])
                            && Integer.parseInt(arr[3]) > Integer.parseInt(arr[4])
                            && Integer.parseInt(arr[4]) > Integer.parseInt(arr[5])
                            && Integer.parseInt(arr[5]) > Integer.parseInt(arr[6])) {
                            idx++;
                            break;
                        } else {
                            break;
                        }
                }
                System.out.println("answer: "+ answer);
                answer = idx;
            }
        }

        System.out.println(answer);

    }

}