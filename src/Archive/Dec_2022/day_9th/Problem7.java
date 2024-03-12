package Archive.Dec_2022.day_9th;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120956
옹알이(1) - 실패, 다른 사람 풀이 참고
최대 100단어로 이루어진 배열이 매개변수로 주어진다.

"aya", "ye", "woo", "ma"

- 로직
이중 for문으로 매개변수 배열의 원소 하나씩 babyword배열의 원소 하나씩 비교하여 " "으로 대체 (""로 대체하면 단어가 붙어서 틀린 답이 나올 수 있다.)
카운트할 옹알이 스트링은 ""만 남는다.
 */
public class Problem7 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWord = {"aya", "ye", "woo", "ma"};
        for (String babble : babbling) {
            for (String word: babyWord) {
                babble = babble.replace(word, " ");
            }
            if (babble.replaceAll(" ", "").equals("")) {
                answer++;
            }
        }

        return answer;

    }

}
