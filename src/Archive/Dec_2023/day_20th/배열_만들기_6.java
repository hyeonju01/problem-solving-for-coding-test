package Archive.Dec_2023.day_20th;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_만들기_6 {


    static class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> stk = new ArrayList<>();
            int stkSize = 0;
            int arrSize = arr.length;
            int idx = 0;

            while(idx < arrSize) {
                if (stk.isEmpty() || stk.get(stkSize - 1) != arr[idx]) {
                    stk.add(arr[idx]);
                } else {
                    if (stk.get(stkSize - 1) == arr[idx]) {
                        stk.remove(stkSize - 1);
                    }
                }
                idx ++;
                stkSize = stk.size();
            }

            // System.out.println("stk: " + stk);
            // System.out.println("stkSize: " + stkSize);

            if (stk.isEmpty()) {
                int[] answer = {-1};
                return answer;
            } else {
                return stk.stream().mapToInt(Integer::intValue).toArray();
            }

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 1, 0};
        System.out.println(Arrays.toString(s.solution(arr)));
    }

}
