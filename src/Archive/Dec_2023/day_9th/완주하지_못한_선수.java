package Archive.Dec_2023.day_9th;

import java.util.*;
public class 완주하지_못한_선수 {


    static class Solution {
        public String solution(String[] participants, String[] completions) {
            String answer = "";

            Map<String, Integer> partiMap = new HashMap<>();
            List<String> compleList = new ArrayList<>(Arrays.asList(completions));

            for(String participant: participants) {
                if (!partiMap.containsKey(participant)) {
                    partiMap.put(participant, 1);
                } else if (partiMap.containsKey(participant)){
                    int num = partiMap.get(participant);
                    partiMap.put(participant, num + 1);
                }
            }
            System.out.println("참여자 맵: " + partiMap);

            System.out.println(partiMap.keySet());

//            for(String key: partiMap.keySet()) {
//                if (compleList.contains(key)) {
//                    int num = partiMap.get(key);
//                    num -= 1;
//                    partiMap.put(key, num);
//                }
//            }

            for(int i = 0; i < compleList.size(); i++) {
                if (partiMap.containsKey(compleList.get(i))) {
                    int num = partiMap.get(compleList.get(i));
                    num --;
                    partiMap.put(compleList.get(i), num);
                }

            }

            System.out.println("참여자 맵:" + partiMap);

            for(String key: partiMap.keySet()) {
                if (partiMap.get(key) != 0) {
                    answer = key;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] participants = {"A", "A", "A", "B", "B", "B", "B"};
        String[] completion = {"A", "A", "B", "B", "B", "B"};
        System.out.println(s.solution(participants, completion));
    }
}