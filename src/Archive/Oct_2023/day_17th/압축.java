package Archive.Oct_2023.day_17th;

import java.util.Arrays;
import java.util.HashMap;

public class 압축 {

    public static void main(String[] args) {
        String[] Alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                             "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        HashMap<String, Integer> dictionary = new HashMap<>(); // key: A Integer: 1

        for (int i = 0; i < Alphabet.length; i++) {
            dictionary.put(Alphabet[i], i+1);
        }

        System.out.println(Arrays.asList(dictionary));

    }

}
