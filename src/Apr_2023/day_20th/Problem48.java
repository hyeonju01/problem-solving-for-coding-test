package Apr_2023.day_20th;

/**
 *  배열 회전시키기
 */
public class Problem48 {

    class Solution {
        public int[] solution(int[] numbers, String direction) {
            int[] answer = new int[numbers.length];
            switch(direction)
            {
                case "right":
                    for(int i = 0; i < answer.length; i++) {
                        if (i == 0) {
                            answer[i] = numbers[numbers.length - 1];
                        } else {
                            answer[i] = numbers[i - 1];
                        }
                    }
                    break;
                case "left":
                    for(int i = 0; i < answer.length; i++) {
                        if (i != answer.length - 1) {
                            answer[i] = numbers[i + 1];
                        } else {
                            answer[i] = numbers[0];
                        }
                    }
                    break;
            }
            return answer;
        }
    }

}
