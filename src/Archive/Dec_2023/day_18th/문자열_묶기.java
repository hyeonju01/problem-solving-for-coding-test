package Archive.Dec_2023.day_18th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class 문자열_묶기 {
    static class Solution {
        public int solution(String[] strArr) {
            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (String str : strArr) {
                int strLen = str.length();

                if (map.containsKey(strLen)) { // Key에 strLen이 없으면, map에 put
                    map.put(strLen, 1);
                } else { // Key에 strLen이 있다면 value를 꺼내서 값을 올려준 후 put
                    int value = map.get(strLen);
                    map.put(strLen, value + 1);
                }
            }

            ArrayList<Integer> list = new ArrayList<>(map.values());

            return list.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(s.solution(strArr));

    }

}