package Archive.Jan_2024.day_26th;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            Map<String, Integer> completionMap = new HashMap<>();
            for (String runner: completion) {
                // runner가 있으면 value + 1, 없으면 default Value(=1)
                completionMap.put(runner, completionMap.getOrDefault(runner, 1) + 1);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(s.solution(participant, completion));

    }

}
