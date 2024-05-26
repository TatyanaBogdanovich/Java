package Homework10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        String[] words = input.split(" ");
        String minUniqueWord = "";
        int minUniqueChars = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueChars = countCharacters(word);
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueWord = word;
            }
        }
        System.out.println("Слово с минимальным числом различных символов: " + minUniqueWord);
    }
    private static int countCharacters(String word) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.length();
    }
}
