package Archive.Mar_2023.day_30th;

/**
 * [프로그래머스] 배열 원소의 길이
 * 매개변수로 주어진 문자열 배열의 길이만큼 answer 배열 방을 만들어줍니다.
 * 문자열 배열을 순회하며, 각각의 원소 문자열의 길이를 answer 배열에 넣어줍니다.
 */

public class Problem23 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for (int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
