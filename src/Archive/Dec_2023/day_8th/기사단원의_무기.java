package Archive.Dec_2023.day_8th;

import java.util.*;
import java.lang.Math;
public class 기사단원의_무기 {

    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            // number: 기사단원 수
            // Limit: 공격력 제한 수치
            // power: 공격력 초과 기사의 공격력

            int[] arr = new int[number + 1];

            for(int i = 1; i < number + 1; i++) {
                int sqrt = (int) Math.sqrt(i);
                System.out.println("sqrt: " + sqrt);
                System.out.println("i :"+ i);
                for (int j = 1; j < sqrt; j++) {
                    if (i % j == 0) {
                        arr[i] ++;
                    }
                }
                if (arr[i] > limit) {
                    arr[i] = power;
                }
                System.out.println("arr: " + Arrays.toString(arr));
                answer += arr[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3, 2));
    }
}
