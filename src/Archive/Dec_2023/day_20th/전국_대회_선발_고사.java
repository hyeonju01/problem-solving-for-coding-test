package Archive.Dec_2023.day_20th;

import java.util.*;
public class 전국_대회_선발_고사 {


    class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            // 전체 n명 중 참여 가능 학생 대상으로 상위 3명 선발

            int answer = 0;

            int students = rank.length;
            int a = 0;
            int b = 0;
            int c = 0;

            ArrayList<Integer> possibleStudents = new ArrayList<>();

            for(int i = 0; i < students; i++) {
                if (attendance[i] == true) {
                    possibleStudents.add(rank[i]); // {7, 2, 5, 4}
                }
            }

            int[] topThree = possibleStudents.stream().sorted().mapToInt(Integer::intValue).toArray();

            a = topThree[0];
            b = topThree[1];
            c = topThree[2];

            return (10000 * a) + (100 * b) + c ;
        }
    }

}
