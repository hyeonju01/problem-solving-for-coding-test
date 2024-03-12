package Archive.Dec_2023.day_26th;

import java.util.Arrays;

public class 연속된_수의_합 {
    static class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];

            int s = 1;
            int sum = 0; // total과 비교하기 위한 변수
            int idx = 0; // answer array의 인덱스

            while(true) {

                for(int i = s; i < s + num; i++) {
                    sum += i; // sum 구하기
                    answer[idx] = i; // 배열에 넣기
                    idx ++; // 배열 인덱스 증가
                }

                if (sum == total) {
                    break;
                } else if (sum < total) {
                    System.out.println("Sum: " + sum);
                    System.out.println("Total: " + total);
                    s ++;
                } else {
                    s --;
                }
                idx = 0;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(3, 12)));
//        System.out.println(Arrays.toString(s.solution(5, 15)));
//        System.out.println(Arrays.toString(s.solution(4, 14)));
//        System.out.println(Arrays.toString(s.solution(5, 5)));

    }
}
