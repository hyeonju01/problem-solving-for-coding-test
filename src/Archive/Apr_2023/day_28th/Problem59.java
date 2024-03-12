//package Problem_solving_archive.Apr_2023.day_28th;
///**
// * 소인수분해
// */
//
//import java.util.ArrayList;
//
//public class Problem59 {
//
//    class Solution {
//        public int[] solution(int n) {
//
//            int prime = 2;
//
//            ArrayList<Integer> answerList = new ArrayList<>();
//
//            while(n > 1) {
//                if(n % prime == 0) {
//                    // 리스트에 prime이 있지 않다면 prime 넣기
//                    if (!answerList.contains(prime)) {
//                        answerList.add(prime);
//                    }
//                    n = n / prime;
//
//                } else {
//                    // 더 이상 소수로 나누어지지 않을 때 그 다음 소수를 찾는다.
//                    prime = prime + 1;
//
//                    if (Solution.isPrime(prime) == 0) { // 0: not prime
//                        while(Solution.isPrime(prime) == 0) { // 0: not prime
//                            prime = prime + 1;
//                        }
//                    }
//                }
//            }
//
//            int[] answer = answerList.stream().mapToInt(i->i).toArray();
//
//            return answer;
//        }
//
//        public static int isPrime(int n) {
//            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
//                if(n % i == 0) {
//                    return 0;
//                }
//            }
//            return 1;
//        }
//    }
//}
