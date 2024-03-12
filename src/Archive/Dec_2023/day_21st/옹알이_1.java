package Archive.Dec_2023.day_21st;

public class 옹알이_1 {

    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] possibleWords = {"aya", "ye", "woo", "ma"};

            for(String el: babbling) {
                for(String word: possibleWords) {
                    if (el.contains(word)) {
                        el = el.replaceAll(word, "");
                        if (el.isBlank()) {
                            answer ++;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] input2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(s.solution(input1));
        System.out.println(s.solution(input2));
    }

}