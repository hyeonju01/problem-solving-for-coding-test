package June_2024.day_17th;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// [BOJ_2309] 일곱난쟁이
public class P2309 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[9];
        for (int i = 0; i < 9; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(people);

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += people[i];
        }

        Loop1:
        for (int i = 0; i < 9; i++) {
            Loop2:
            for (int j = i+1; j < 9; j++) {

                if (sum-people[i]-people[j] == 100) {
                    people[i] = 0; people[j] = 0;
                    break Loop1;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (people[i] != 0) System.out.println(people[i]);
        }

    }
}