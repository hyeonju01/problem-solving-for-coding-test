package Archive.Dec_2023.day_6th;

public class 공던지기 {

    static class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0; // 순서
            int shooter = 0; // 공던지는 사람
            int idx = 0; // 인덱스

            while (true) {
                if (idx < numbers.length) {
                    shooter = numbers[idx];
                    idx += 2;
                    answer ++; // 2
                } else if (idx >= numbers.length) {
                    idx %= numbers.length;
                    shooter = numbers[idx];
                    idx +=2;
                    answer ++;
                }

                if (answer == k) {
                    break;
                } else {
                    continue;
                }
            }

            System.out.println("idx, shooter, answer: " + idx + " " + shooter + " " + idx);

            return shooter;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 2, 3};
        int k = 3;
        System.out.println(s.solution(numbers, k));
    }

}
