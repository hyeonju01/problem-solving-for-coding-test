package May_2023.day_31st;

/**
 * 중복된 문자 제거
 */
public class Problem66 {
    public String solution(String my_string) {
        String answer = "";
        String[] my_stringArr = my_string.split("");
        for (String s: my_stringArr) {
            if (!answer.contains(s)) {
                answer = answer + s;
            }
        }
        return answer;
    }
}