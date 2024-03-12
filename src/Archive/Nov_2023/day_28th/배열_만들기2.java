package Archive.Nov_2023.day_28th;

import java.util.*;
public class 배열_만들기2 {

    static class Solution {
        public int[] solution(int l, int r) {
            List<Integer> list = new ArrayList<>();

            // 0, 5로만 이루어진 모든 정수 찾기..
            for (int i = l; i < r+1; i++) {
                // String numStr = String.valueOf(i);
                int currentNum = i;
                boolean containsZeroOrFive = false;
                while (currentNum > 0) {
                  int digit = currentNum % 10;
                  if (digit == 0 || digit == 5) {
                      containsZeroOrFive = true;
                  } else {
                      containsZeroOrFive = false;
                      break;
                  }
                  currentNum /= 10;
                }
                if (containsZeroOrFive) {
                    list.add(i);
                }
//                if () {
//                    list.add(Integer.valueOf(numStr));
//                }
            }

            if (list.isEmpty()) {
                list.add(-1);
                return list.stream().mapToInt(Integer::intValue).toArray();
            }

            return list.stream().mapToInt(Integer::intValue).toArray();
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(5, 555)));
    }
}