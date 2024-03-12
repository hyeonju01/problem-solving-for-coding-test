package Archive.Apr_2023.day_17th;

import java.util.ArrayList;

/**
 * n의 배수 고르기
 */
public class Problem46 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            ArrayList arrList = new ArrayList();
            for(int i = 0; i < numlist.length; i++) {
                if (numlist[i] % n == 0) {
                    arrList.add(numlist[i]);
                }
            }
            int[] answer = new int[arrList.size()];
            for (int i = 0; i < arrList.size(); i++) {
                answer[i] = (int) arrList.get(i);
            }
            return answer;
        }
    }
}
