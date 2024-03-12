package Archive.Dec_2023.day_11st;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의_원소만큼_추가하기 {

    static class Solution {
        public int[] solution(int[] arr) {
            int arrLen = arr.length;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arrLen; i++) {
                int num = arr[i];
                for (int j = 0; j < num; j++) {
                    list.add(num);
                }
            }

            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // int[] num = {5, 1, 4};
        // int[] num = {6, 6};
        int[] num = {1};
        System.out.println(Arrays.toString(s.solution(num)));
    }

}
