package Archive.Dec_2022.day_10th;

/*
[프로그래머스] 배열 두 배 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class Problem9 {
    class Solution{
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }
            return answer;
        }
    }
}
