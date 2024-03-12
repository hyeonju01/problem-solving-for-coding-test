package Archive.Dec_2022.day_2st;

/*
[Programmers] 중복된 숫자 개수
https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */

public class Problem1 {

    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    answer += 1;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {

    }

}
