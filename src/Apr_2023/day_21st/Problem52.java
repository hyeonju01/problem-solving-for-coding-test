package Apr_2023.day_21st;

/**
 * 진료 순서 정하기
 * 이중 for문으로 입력 배열을 순회하며, 더 큰 값이 나타날 경우
 * 자신의 값을 1 올려준다.
 *
 */
public class Problem52 {

    class Solution {
        public int[] solution(int[] emergency) {
            int[] answer = new int[emergency.length];

            for(int i = 0; i < emergency.length; i++) {
                for (int j = i; j < emergency.length; j++) {
                    if (emergency[i] < emergency[j]) {
                        answer[i] = answer[i] + 1;
                    } else {
                        answer[j] = answer[j] + 1;
                    }
                }
            }

            return answer;
        }
    }

}
