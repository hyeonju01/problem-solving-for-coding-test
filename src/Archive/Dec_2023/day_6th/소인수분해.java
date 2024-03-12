package Archive.Dec_2023.day_6th;

import java.util.ArrayList;
import java.util.Arrays;

public class 소인수분해 {
    static class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            // int[] primeNum = {2, 3, 5, 7, 11};

            int idx = 2;
            ArrayList<Integer> arr = new ArrayList<>();

//            System.out.println("1 is Prime? :" + isPrime(1));
//            System.out.println("2 is Prime? :" + isPrime(2));
//            System.out.println("3 is Prime? :" + isPrime(3));
//            System.out.println("4 is Prime? :" + isPrime(4));
//            System.out.println("5 is Prime? :" + isPrime(5));
//            System.out.println("6 is Prime? :" + isPrime(6));
//            System.out.println("7 is Prime? :" + isPrime(7));

            while(idx <= n) {
                // idx가 소수인지 검증
                if (isPrime(idx)) {
                    if (n % idx == 0) {
                        n = n / idx;
                        if (!arr.contains(idx)) {
                            arr.add(idx);
                        }
                    }
                }
                idx ++;
            }

            return arr.stream().mapToInt(Integer::intValue).toArray();
        }

        // num >= 2
        boolean isPrime(int num) {
            int temp = 0;
            for(int i = 1; i < num + 1; i++) { // 1부터 자신까지
                if (num % i == 0) {
                    temp++;
                }
            }
            if (temp == 1) { // 1은 소수가 아니다
                return false;
            } else if (temp == 2) { // 소수는 나 자신과 1이라는 두 가지 수로 이뤄짐.
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(Arrays.toString(s.solution(12)));
//        System.out.println(Arrays.toString(s.solution(17)));
        System.out.println(Arrays.toString(s.solution(420)));

    }
}