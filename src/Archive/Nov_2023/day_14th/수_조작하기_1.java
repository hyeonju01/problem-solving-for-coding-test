package Archive.Nov_2023.day_14th;

public class 수_조작하기_1 {

    static class Solution {
        public int solution (int n, String control) {
            int answer = 0;

            for (int i = 0; i < control.length(); i++) {
                String c = String.valueOf(control.charAt(i));
                switch (c) {
                    case "w":
                        n ++;
                        break;
                    case "s":
                        n --;
                        break;
                    case "d":
                        n = n + 10;
                        break;
                    case "a":
                        n = n - 10;
                        break;
                }
            }

            return n;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(0, "wsdawsdassw"));

    }

}
