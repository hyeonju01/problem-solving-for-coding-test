package Archive.Dec_2023.day_18th;

import java.util.ArrayList;
import java.util.Arrays;

public class _2의영역 {

    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            int arrSize = arr.length;
            ArrayList<Integer> idxOfTwo = new ArrayList<>();

            for(int i = 0; i < arrSize; i++) {
                if (arr[i] == 2) {
                    idxOfTwo.add(i);
                }
            }

            int listSize = idxOfTwo.size();

            if (listSize == 0) {
                answer = new int[]{-1};
                return answer;
            } else if(listSize == 1) {
                answer = new int[]{2};
                return answer;
            } else {
                int s = idxOfTwo.get(0);
                int e = idxOfTwo.get(listSize - 1);
                int idx = 0;
                int arraySize = e-s+1;
                answer = new int[arraySize];
                for (int i = s; i < e+1; i++) {
                    answer[idx] = arr[i];
                    idx ++;
                }

                return answer;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(arr)));

    }

}