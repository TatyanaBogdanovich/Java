package Homework10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();

        String[] words = line.split(" ");

        String ShortestWord = words[0];
        String LongestWord = words[0];

        for (String word : words) {
            if (word.length() < ShortestWord.length()) {
                ShortestWord = word;
            }
            if (word.length() >= LongestWord.length()) {
                LongestWord = word;
            }
        }
        System.out.println("Самое короткое слово: " + ShortestWord);
        System.out.println("Самое длинное слово: " + LongestWord);
    }
}
