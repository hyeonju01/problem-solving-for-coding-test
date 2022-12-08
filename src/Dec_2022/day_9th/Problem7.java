package Dec_2022.day_9th;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120956
옹알이(1) - 실패
최대 100단어로 이루어진 배열이 매개변수로 주어진다.

"aya", "ye", "woo", "ma"
1가지 - 4단어
2가지 - 12단어
3가지 - 4 * 3 * 2 = 24단어
4가지 - 4 * 3 * 2 * 1 = 24단어
발음 가능한 단어의 수 : 총 4+12+24*2 = 16+ 48 = 64가지 맞나요?

- 로직
babbling을 정렬합니다. (알파벳 오름차순)
매개변수 배열의 원소가 발음 가능 단어 배열에 있으면 카운트를 올린다.
 */
public class Problem7 {
    public int solution(String[] babbling) {
        int answer = 0;
        Arrays.sort(babbling); //알파벳 오름차순 정렬
        for (int i = 0; i < babbling.length; i++) {
            switch (babbling[i].charAt(0)) {
                case 'a':
                    if (babbling[i].contains("aya")
                            || babbling[i].contains("ma")
                            || babbling[i].contains("woo")
                            || babbling[i].contains("ye")) {
                        answer ++;
                        break;
                    };
                case 'm':
                    if (babbling[i].contains("ma")
                            || babbling[i].contains("woo")
                            || babbling[i].contains("ye")) {
                        answer ++;
                        break;
                    };
                case 'w':
                    if (babbling[i].contains("woo")
                            || babbling[i].contains("ye")) {
                        answer ++;
                        break;
                    };
                case 'y':
                    if (babbling[i].contains("ye")) {
                        answer ++;
                        break;
                    };
                default:
                    break;
            }
        }
        return answer;
    }

//    public static void main(String[] args) {
//        Problem7 p = new Problem7();
//        String[] b = {"aya", "yee", "u", "maa", "wyeoo"};
//        System.out.println(Arrays.toString(p.solution(b)));
//    }

}
