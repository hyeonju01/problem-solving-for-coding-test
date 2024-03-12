package Archive.Nov_2023.day_1st;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 프로그래머스, 미해결
 */
public class 보석_쇼핑 {

    static class Solution {
        public int[] solution(String[] gems) {
            int[] answer = {};

            Map<Integer, String> gemsMap = new HashMap<>();
            List<String> gemList = new ArrayList<>();


            for(int i = 0; i < gems.length; i++) {
                gemsMap.put(i+1, gems[i]);
                if(!gemList.contains(gems[i])) { // False
                    gemList.add(gems[i]);
                }
            }

            for(int i = 0; i < gems.length; i++) {
                for(int j = 1; i < gems.length; j++) {

                    //System.out.println(Arrays.toString(subGem));
                }
            }


            System.out.print(gemsMap);
            System.out.print(gemList);


            return answer;
        }
    }

    public static void main(String[] args) {
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        Solution solution = new Solution();
        solution.solution(gems);
    }

}
