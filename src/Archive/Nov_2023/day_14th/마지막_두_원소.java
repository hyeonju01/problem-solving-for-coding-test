package Archive.Nov_2023.day_14th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 마지막_두_원소 {

    static class Solution {
        public int[] solution(int[] num_list) {
            int[] answer;
            List<Integer> answerList = new ArrayList<>();
            for (int num: num_list) {
                answerList.add(num);
            }

            int lastIdx = num_list.length - 1;
            int lastNum = 0;

            if (num_list[lastIdx] > num_list[lastIdx - 1]) {
                lastNum = num_list[lastIdx] - num_list[lastIdx - 1];
                answerList.add(lastNum);
            } else {
                lastNum = num_list[lastIdx] * 2;
                answerList.add(lastNum);
            }

            answer = answerList.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] num_list_1 = {2, 1, 6};
        int[] num_list_2 = {5, 2, 1, 7, 5};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(num_list_1)));
        System.out.println(Arrays.toString(solution.solution(num_list_2)));
    }

}
