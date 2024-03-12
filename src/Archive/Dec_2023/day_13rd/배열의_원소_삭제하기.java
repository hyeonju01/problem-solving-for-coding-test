package Archive.Dec_2023.day_13rd;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의_원소_삭제하기 {
    static class Solution {
        public int[] solution(int[] arr, int[] delete_list) {
            ArrayList<Integer> answer = new ArrayList<>();

            // 정수 배열 -> 정수 리스트
            for(int num: arr) {
                answer.add(num);
            }

            for(int delNum: delete_list) {
                int idx = answer.indexOf(delNum);

                if (idx != -1) {
                    answer.remove(idx);
                }
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(arr, delete_list)));
    }

}

