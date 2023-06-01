package Jun_2023.day_1st;
import java.lang.Math;

/**
 * [프로그래머스] 가까운 수
 */

public class Problem67 {
    public int solution(int[] array, int n) {
        int answer = 0;
        if (array.length == 1) {
            answer = array[0];
        } else {
            for(int num: array) {
                if (Math.abs(n - answer) > Math.abs(n - num)) {
                    answer = num;
                } else if (Math.abs(n - answer) == Math.abs(n - num)) {
                    answer = Math.min(answer, num);
                } else {
                    answer = answer;
                }
            }
        }
        return answer;
    }
}