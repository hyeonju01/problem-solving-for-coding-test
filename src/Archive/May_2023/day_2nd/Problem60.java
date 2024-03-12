package Archive.May_2023.day_2nd;
import java.util.Stack;

/**
 * 컨트롤 제트
 */

public class Problem60 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] stringArr = new String[s.length()];
            stringArr = s.split(" ");

            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < stringArr.length; i++) {
                try{
                    int num = Integer.parseInt(stringArr[i]);
                    stack.push(num);
                    answer = answer + num;

                } catch (Exception e){
                    answer = answer - stack.pop();
                }
            }

            return answer;
        }
    }
}
