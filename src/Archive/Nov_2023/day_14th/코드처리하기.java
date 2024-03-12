package Archive.Nov_2023.day_14th;

public class 코드처리하기 {

    static class Solution {
        public String solution(String code) {
            String answer = "";
            int mode = 0;
            String ret = "";

            for(int i = 0; i < code.length(); i++) {
                System.out.println(i+"번째는"+code.charAt(i));

                if (mode == 0) {
                    if (code.charAt(i) != '1') {
                        if (i % 2 == 0 || i % 2 == 2) {
                            ret = ret + code.charAt(i);
                            System.out.println(ret);
                        }
                    } else {
                        mode = 1;
                    }
                } else {
                    if (code.charAt(i) != '1') {
                        if (i % 2 == 1) {
                            ret = ret + code.charAt(i);
                            System.out.println(ret);
                        }
                    } else {
                        mode = 0;
                    }
                }
            }
            if (ret == "") {
                answer = "EMPTY";
            } else {
                answer = ret;
            }


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("abc1abc1abc"));
    }

}
