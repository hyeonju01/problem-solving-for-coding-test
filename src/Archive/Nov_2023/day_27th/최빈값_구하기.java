package Archive.Nov_2023.day_27th;

import java.util.*;
public class 최빈값_구하기 {
    static class Solution {
        public int solution(int[] array) {
            int answer = 0; // key
            int secondKey = -1; // key
            int maxModeValue = -1; // value

            Map<Integer, Integer> modeMap = new HashMap<>();

            // {1: 1, 2:1, 3:3, 4:1}
            for(int num: array) {
                if (!modeMap.containsKey(num)) {
                    modeMap.put(num, 1);
                } else {
                    int value = modeMap.get(num);
                    modeMap.put(num, value + 1);
                }
            }

            for (Integer key: modeMap.keySet()) {
                if (modeMap.get(key) > maxModeValue) {
                    maxModeValue = modeMap.get(key); // value 저장
                    answer = key; // key 저장
                } else if (modeMap.get(key) == maxModeValue) {
                    secondKey = key; // 동일한 Key 저장
                }
            }

            if (modeMap.get(answer) == modeMap.get(secondKey)) {
                return -1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 1, 2, 2};
        System.out.println(solution.solution(array));
    }



}
