package Archive.Apr_2023.day_12th;

import java.util.Arrays;

/**
 * 문자열 정렬하기 (1)
 * String의 글자만 제거한다. 이 때 비숫자 정규표현식에 주의할 것
 */
public class Problem42 {

    class Solution {
        public int[] solution(String my_string) {

            String nums = my_string.replaceAll("[^0-9]", ""); // 글자 제거
            int[] answer = new int[nums.length()]; // 배열 생성

            int index = 0;

            for (int i = 0; i < nums.length(); i++) {
                String c = Character.toString(nums.charAt(i));
                int result = Integer.parseInt(c);
                answer[index] = result;
                index ++;
            }

            Arrays.sort(answer);

            return answer;
        }
    }

}
