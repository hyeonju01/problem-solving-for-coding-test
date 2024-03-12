package Archive.Dec_2023.day_19th;


import java.math.BigInteger;

public class 두_수의_합 {

    static class Solution {
        public String solution(String a, String b) {
            // String answer = "";
            BigInteger numA = new BigInteger(a);
            BigInteger numB = new BigInteger(b);

            return (numA.add(numB)).toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        System.out.println(s.solution(a, b));
    }

}
