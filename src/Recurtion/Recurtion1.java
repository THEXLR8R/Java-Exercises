package Recurtion;

import java.util.ArrayList;
import java.util.List;

public class Recurtion1 {

    private static ArrayList<String> getAllBitNumbers(int n) {
        List<String> combinations = new ArrayList<>();
        generateNBitCombinations("", n, combinations);
        return (ArrayList<String>) combinations;
    }

    private static void generateNBitCombinations(String combination, int n, List<String> combinations) {
        if (combination.length() == n) {
            combinations.add(combination);
            return;
        }

        generateNBitCombinations(combination + "0", n, combinations);
        generateNBitCombinations(combination + "1", n, combinations);



    }
    public static void main(String[] args) {
        getAllBitNumbers(4)
                .forEach(System.out::println);
    }


}
