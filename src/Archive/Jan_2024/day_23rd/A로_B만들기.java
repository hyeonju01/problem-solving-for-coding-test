package Archive.Jan_2024.day_23rd;

import java.util.HashMap;
import java.util.Map;

public class A로_B만들기 {

    public int solution(String before, String after) {
        int answer = 0;

        Map<Character, Integer> beforeWords = new HashMap<>();
        Map<Character, Integer> afterWords = new HashMap<>();
        int length = before.length();

        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        for (int i = 0; i < length; i++) {
            char beforeKey = beforeChar[i];
            char afterKey = afterChar[i];

            if (!beforeWords.containsKey(beforeKey)) {
                beforeWords.put(beforeKey, 1);
            } else {
                int value = beforeWords.get(beforeKey);
                beforeWords.put(beforeKey, value + 1);
            }

            if (!afterWords.containsKey(afterKey)) {
                afterWords.put(afterKey, 1);
            } else {
                int value = afterWords.get(afterKey);
                afterWords.put(afterKey, value + 1);
            }
        }

        for (Character c: beforeChar) {
            System.out.println(c);
            System.out.println(beforeWords.get(c));
            System.out.println(afterWords.get(c));
            if (beforeWords.get(c) != afterWords.get(c)) {
                return 0;
            }
        }

        return 1;
    }

}
