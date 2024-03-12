package Archive.Dec_2023.day_27th;

import java.util.ArrayList;
import java.util.HashMap;

public class 한_번만_등장한_문자 {

    static class Solution {
        public String solution(String s) {
            ArrayList<String> answer = new ArrayList<>();

            HashMap<String, Integer> map = new HashMap<>();
            int strLen = s.length();

            for (int i = 0; i < strLen; i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(String.valueOf(s.charAt(i)), 1);
                } else {
                    int v = map.get(s.charAt(i));
                    map.put(String.valueOf(s.charAt(i)), v+1);
                }
            }

            for(String key: map.keySet()) {
                if (map.get(key) == 1) {
                    answer.add(key);
                }
            }

            System.out.println(map);

            return answer.stream().sorted().toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcabcadc"));
        System.out.println(s.solution("abdc"));
        System.out.println(s.solution("hello"));
    }

}
